import java.util.Scanner;

public class Loop_Practice4 {
    Scanner s;

    int num;
    int start_num;
    int sum;

    Loop_Practice4() {
        s = new Scanner(System.in);
    }

    public void getInt() {
        System.out.println("Enter a number to count to");
        num = s.nextInt();
        System.out.println("Enter a number to start from");
        start_num = s.nextInt();
    }

    public void display() {

        for (int i = start_num; i < num; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Loop_Practice4 f = new Loop_Practice4();
        f.getInt();
        f.display();
    }
}
