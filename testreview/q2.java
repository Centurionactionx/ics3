import java.util.Scanner;

public class q2 {

    Scanner s;

    q2(){
        s = new Scanner(System.in);
    }
    public void enterint(){
        double n;
        try {
            System.out.println("Enter a number");
            n = Double.parseDouble(s.nextLine());
            System.out.println("Cool man");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        q2 q = new q2();
        q.enterint();
    }
}
