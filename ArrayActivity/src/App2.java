import java.util.Scanner;
import java.lang.Math;

public class App2 {

    Scanner s;
    int[] nums;
    int n;
    long startTime = System.nanoTime();

    App2() {
        s = new Scanner(System.in);
    }

    public void askData() {
        System.out.println("How many numbers do you want to enter");
        n = s.nextInt();
        nums = new int[n];

        System.out.printf("Enter %d numbers%n", n);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
    }

    public boolean calculatePrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void display() {
        System.out.printf("%-10s %s%n", "Number", "isPrime");
        String primeStatus;
        for (int i = 0; i < nums.length; i++) {
            if (calculatePrime(nums[i])) {
                primeStatus = "Yes";
            } else {
                primeStatus = "No";
            }
            System.out.printf("%-10d %s%n", nums[i], primeStatus);
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static void main(String[] args) {
        App2 a = new App2();
        a.askData();
        a.display();
    }
}