package testreview;
import java.util.Scanner;

public class q5 {
    Scanner s;

    q5(){
        s = new Scanner(System.in);
    }

    public void calculate(int a, int b){
        System.out.println(a + b);
    }

    public void calculate(int a, int b, int c, double d){
        System.out.println(a + b + c + d);
    }

    public void calculate(double d, double e){
        System.out.println(d + e);
    }

    public void driver(){
        System.out.println("Enter 3 ints and two doubles");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        s.nextLine();
        double d = Double.parseDouble(s.nextLine());
        double e = Double.parseDouble(s.nextLine());
        calculate(a, b);
        calculate(a, b, c, d);
        calculate(d, e);
    }

    public static void main(String[] args) {
        q5 q = new q5();
        q.driver();
    }
}
