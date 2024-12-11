package testreview;
import java.io.*;
import java.util.Scanner;

public class q5 {
    Scanner s;
    int[] nums;

    q5(){
        s = new Scanner(System.in);
    }

    public void driver(){
        File f;
        try {
            f = new File("ints.txt");
            nums = new int[filesize(f)];
            s = new Scanner(f);
            int index = 0;
            while(s.hasNextLine()){
                nums[index] = Integer.parseInt(s.nextLine());
                index++;
            }
            s.close();

            int prod = 1;
            for (int i = 0; i < nums.length; i++){
                prod *= nums[i];
            }
            System.out.println(prod);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public int filesize(File f){
        int count = -1;
        try {
            Scanner a = new Scanner (f);
            count = 0;
            while(a.hasNextLine()){
                a.nextLine();
                count++;
            }
            a.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return count;
    }

    public static void main(String[] args) {
        q5 q = new q5();
        q.driver();
    }
}
