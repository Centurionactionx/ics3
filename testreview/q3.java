package testreview;
import java.util.Scanner;

public class q3 {
    Scanner s;
    q3(){
        s = new Scanner(System.in);
    }
    int x;
    int m;
    int b;
    public int display(){
        x = s.nextInt();
        m = s.nextInt();
        b = s.nextInt();
        return (m*x+b);
    }

    public static void main(String[] args) {
        q3 q = new q3();
        System.out.println(q.display());
    }
    
}
