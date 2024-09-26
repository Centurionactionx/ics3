import java.util.Scanner;

public class Nest_Practice {
    Scanner s;

    Nest_Practice(){
        s = new Scanner(System.in);
    }

    int choice;
    double num1;
    double num2;

    public void menu(){
        System.out.println("Menu options:");
        System.out.println("1 - ADD");
        System.out.println("2 - SUB");
        System.out.println("3 - MUL");
        System.out.println("4 - DIV");
        choice = s.nextInt();
    }

    public void getNums(){
        System.out.println("Enter the first number:");
        num1 = s.nextDouble();
        System.out.println("Enter the second number:");
        num2 = s.nextDouble();
    }

    public void calculate(){
        if (choice == 1){
            System.out.println(num1+num2);
        }
        else if (choice == 2){
            System.out.println(num1-num2);
        }
        else if (choice == 3){
            System.out.println(num1*num2);
        }
        else if (choice == 4){
            System.out.println(num1/num2);
        }
    }

    public static void main(String[] args) {
        Nest_Practice n = new Nest_Practice();
        n.menu();
        n.getNums();
        n.calculate();
    }
}
