package testreview;
import java.util.Scanner;

public class q1 {
    Scanner s;
    q1(){
        s = new Scanner(System.in);   
    }

    int a;
    int b;

    public int calculate(){
        a = s.nextInt();
        b = s.nextInt();
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        } 
        return sum;
    }

    public static void main(String[] args) {
        q1 c = new q1();
        System.out.println(c.calculate());
    }
}
