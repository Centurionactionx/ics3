import java.util.Scanner;

public class App {

    Scanner s;

    App() {
        s = new Scanner(System.in);
    }

    private boolean parity(int n) {
        return n % 2 == 0;
    }

    public void display() {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        boolean equals = parity(n);
        System.out.println(equals);
    }

    public static void main(String[] args) {
        App a = new App();
        a.display();
    }
}
