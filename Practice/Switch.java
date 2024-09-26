import java.util.Scanner;

public class Switch {

    Scanner s;
    int num;

    Switch(){
        s = new Scanner (System.in);
    }

    private boolean isEven (int n){
        return n % 2 == 0;
    }

    public void askData(){
        System.out.println("Enter a number");
        num = s.nextInt();
    }

    public void display(){
        if (isEven(num)){
            System.out.printf("%d is even", num);
        }

        else {
            System.out.printf("%d is odd", num);
        }
    }

    public void display2(){
        if (num > 5){
            System.out.printf("%d is greater than 5", num);
        }
        else if (num < 5){
            System.out.printf("%d is less than 5", num);
        }
        else {
            System.out.printf("%d is 5", num);
        }
    }

    public static void main(String[] args) {
        Switch s = new Switch();
        s.askData();
        s.display();
        System.out.printf("%n");
        s.display2();
    }
}
