/*
 * Name: Joseph Wang
 * Date: November 5
 * Description: a program that checks which of the user's input is prime
 */

import java.util.Scanner;
import java.lang.Math;

public class PrimeChecker {

    Scanner s;
    int[] nums;
    String[] primes;
    int n;

    PrimeChecker() {
        s = new Scanner(System.in);
    }

    public void askData() {
        // Gets the length of the array to store entered numbers
        System.out.println("How many numbers do you want to enter");
        n = s.nextInt();
        nums = new int[n];

        // Gets each number in the array
        System.out.printf("Enter %d numbers%n", n);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
    }

    public boolean calculatePrime(int n) {
        if (n <= 1) { // Negative numbers are not prime
            return false;
        }
        if (n == 2) { // Checking for 2 - specialized case
            return true; 
        }
        if (n % 2 == 0) { // Returns false for any even number 
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) { // Iterates to the square root of the number, skipping every even number
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void display() {
        // Sets the length of the prime list to the length of the nums list
        primes = new String[nums.length];

        System.out.printf("%-10s %s%n", "Number", "isPrime"); // The header of the table
        String primeStatus;
        for (int i = 0; i < nums.length; i++) { // For each number in the list, prints if it's true or false and sets the status in the Prime array
            if(calculatePrime(nums[i])){
                primeStatus = "Yes";
                primes[i] = "true";
            } else {
                primeStatus = "No";
                primes[i] = "false";
            }
            System.out.printf("%-10d %s%n", nums[i], primeStatus);
        }
    }

    public static void main(String[] args) {
        PrimeChecker a = new PrimeChecker();
        a.askData();
        a.display();
    }
}
