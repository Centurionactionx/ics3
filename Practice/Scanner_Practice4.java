import java.util.Scanner;

public class Scanner_Practice4 {
    
    Scanner s;
    double price1;
    double price2;
    double price3;

    Scanner_Practice4(){
        s = new Scanner (System.in);
    }

    public void askData(){
        System.out.println("Enter the first price");
        price1 = s.nextDouble();
        System.out.println("Enter the second price");
        price2 = s.nextDouble();
        System.out.println("Enter the third price");
        price3 = s.nextDouble();
    }

    public void display(){
        System.out.printf("The price is %.2f", price1+price2+price3);
    }

    public static void main(String[] args) {
        Scanner_Practice4 m = new Scanner_Practice4();
        m.askData();
        m.display();
    }


}
