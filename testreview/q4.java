package testreview;
import java.util.Scanner;

public class q4 {
    Scanner s;
    int[] arr;
    int sum = 0;

    q4(){
        s = new Scanner(System.in);
    }

    public void display(){
        arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < 5; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        q4 q = new q4();
        q.display();
    }
    
}
