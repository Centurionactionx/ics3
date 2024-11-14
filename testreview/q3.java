package testreview;
import java.util.Scanner;

public class q3 {
    Scanner s;
    q3(){
        s = new Scanner(System.in);
    }

    public void method1(){
        System.out.println("ligger");
    }
    public void method2(){
        System.out.println("digger");
    }
    public void method3(){
        System.out.println("trigger");
    }

    public void decision(){
        char choice = 'n';
        System.out.println("Enter a choice a, b, or c");
        choice = s.nextLine().charAt(0);
        switch(choice){
            case 'a':
            method1();
            break;
            case 'b':
            method2();
            break;
            case 'c':
            method3();
            break;
            default:
            break;
        }
    }

    public static void main(String[] args) {
        q3 q = new q3();
        q.decision();
    }
    
}
