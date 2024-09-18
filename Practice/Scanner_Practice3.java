import java.util.Scanner;

public class Scanner_Practice3 {
    
    Scanner s;
    String name;
    int age;

    Scanner_Practice3(){
        s = new Scanner (System.in);
    }

    public void askData(){
        System.out.println("Enter your name");
        name = s.nextLine();
        System.out.println("Enter your age");
        age = s.nextInt();
    }

    public void display(){
        System.out.printf("Your name is %s and you will be %d in 10 years", name, age+10);
    }

    public static void main(String[] args) {
        Scanner_Practice3 m = new Scanner_Practice3();
        m.askData();
        m.display();
    }


}
