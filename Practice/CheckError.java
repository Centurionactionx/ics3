import java.util.Scanner;

public class CheckError {

    Scanner s;

    CheckError(){
        s = new Scanner (System.in);
    }

    public void guard(){
        System.out.println("Enter the numerator and denominator");
        int num = s.nextInt();
        int denom = s.nextInt();
        if (denom == 0){
            System.out.println("invalid denominator");
        } 
        else {
            System.out.printf("%d / %d = %d", num, denom, num/denom);
        }
    }
    public static void main(String[] args) {
        CheckError c = new CheckError();
        c.guard();
    }
}    

