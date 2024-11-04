import java.util.Scanner;
import java.lang.Math; 

public class App {

    Scanner s;
    int[] nums;
    int n;

    App(){
        s = new Scanner(System.in);
    }

    public void askData(){
        
        System.out.println("How many numbers do you want to enter");
        n = s.nextInt();
        nums = new int[n];

        System.out.printf("Enter %d numbers", n);
        for(int i = 0; i < nums.length; i++){
            nums[i] = s.nextInt();
        }
    }

    public boolean calculatePrime(int n){
        if(n <= 0){
            return false;
        }
        if (n == 2){
            return true;
        }
        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public void display(){
        for (int i = 0; i < nums.length; i++){
            if(calculatePrime(nums[i])){
                System.out.printf("%n%d is a prime number", nums[i]);
            } else {
                System.out.printf("%n%d is not a prime number", nums[i]);
            }
        }
        
    }

    public static void main(String[] args) {
        App a = new App();
        a.askData();
        a.display();
    }
}
