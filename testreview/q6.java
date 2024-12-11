package testreview;
import java.io.*;
import java.util.Scanner;

public class q6 {
    Scanner s;
    String[] data;
    
    q6(){
        s = new Scanner(System.in);
    }

    

    public void driver(){
        PrintWriter p;
        System.out.println("Enter the number of lines in the file");
        int lines = s.nextInt();
        s.nextLine();

        data = new String[lines];

        for (int i = 0; i < data.length; i++){
            System.out.println("Enter a line");
            data[i] = s.nextLine();
        }

        try {
            p = new PrintWriter(new FileWriter("words.txt", false));
            for (int i = 0; i < data.length; i++){
                p.println(data[i]);
            }
            p.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args){
        q6 q = new q6();
        q.driver();
    }
}
