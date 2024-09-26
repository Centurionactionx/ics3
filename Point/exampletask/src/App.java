import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime; 

public class App {

    int choice;
    Scanner s;
    App(){
        s = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1 - numbers");
        System.out.println("2 - words");
        System.out.println("3 - both");
        choice = s.nextInt();
    }

    public void option(int n){
        switch(n){
            case 1:
            LocalTime myObj = LocalTime.now();
            System.out.println(myObj);
            break;
            case 2:
            System.out.println("September twenty fifth, twenty twenty four");
            break;
            case 3:
            LocalTime myObj2 = LocalTime.now();
            System.out.println(myObj2);
            System.out.println("September twenty fifth, twenty twenty four");
            break;
        }
    }

    public void display(){
        option(choice);
    }


    public static void main(String[] args) throws Exception {
        App a = new App();
        a.displayMenu();
        a.display();
    }
}
