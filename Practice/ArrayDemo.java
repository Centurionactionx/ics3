import java.util.Scanner;

public class ArrayDemo {
    
    Scanner s;
    int[] nums;

    ArrayDemo(){
        s = new Scanner(System.in);
    }

    public void askData(){
        int n;
        System.out.println("How many numbers do you want to enter");
        n = s.nextInt();
        nums = new int[n];

        System.out.printf("Enter %d numbers", n);
        for(int i = 0; i < nums.length; i++){
            nums[i] = s.nextInt();
        }
    }

    public void display(){
        int n = 0;
        for (int i : nums) {
            n+=i;
        }

        System.out.println(n/nums.length);
    }

    public static void main(String[] args) {
        ArrayDemo a = new ArrayDemo();
        a.askData();
        a.display();
    }


}
