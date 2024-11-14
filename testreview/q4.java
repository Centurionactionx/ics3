package testreview;
import java.util.Scanner;

public class q4 {
    Scanner s;

    q4(){
        s = new Scanner(System.in);
    }

    public void odd(){
        double n = 0.0;
        do {
            try {
                System.out.println("Enter a positive number or negative even number");
                n = Double.parseDouble(s.nextLine());
            } catch (Exception e) {
                System.out.println("Enter again");
            }    
        } while (n < 0 && n % 2 != 0);
        System.out.println("Thanks for entering an accepted input");


    }

    public static void main(String[] args) {
        q4 q = new q4();
        q.odd();
    }
    
}
