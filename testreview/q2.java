package testreview;
import java.util.Scanner;

public class q2 {

    Scanner s;
    int num;
    q2(){
        s = new Scanner(System.in);
    }
    public void display(){
        num = s.nextInt();
        int fact = 1;
        for(int i = num; i >= 1; i--){
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        q2 q = new q2();
        q.display();
    }
}
