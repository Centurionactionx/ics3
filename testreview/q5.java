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
        try{
            f = new File("words.txt");
            Scanner a = new Scanner(f);
            nums = new int[filesize(f)];

            int index = 0;
            while(a.hasNextLine()){
                nums[index] = a.nextInt();    
                index++;            
            }
            a.close();
        }catch(Exception e){

        }

        int prod = 1;
        for (int n:nums){
            prod *= n;
        }
        System.out.println(prod);
    }

    public int filesize(File f){
        int count = -1;
        try{
            count = 0;
            Scanner a = new Scanner(f);
            while(a.hasNextLine()){
                a.nextLine();
                count++;
            }
            a.close();
        } catch(Exception e){
        }
        return count;
    }

    public static void main(String[] args) {
        q5 q = new q5();
        q.driver();
    }
}
