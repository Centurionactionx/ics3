import java.util.Scanner;

public class Loop_Practice3 {
    Scanner s;

    int num;
    int sum;

    Loop_Practice3() {
        s = new Scanner(System.in);
    }

    public void getInt() {
        System.out.println("Enter a number to count to");
        num = s.nextInt();
    }

    public void display() {

        for (int i = 0; i < num; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Loop_Practice3 f = new Loop_Practice3();
        f.getInt();
        f.display();
    }
}
