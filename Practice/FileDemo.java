import java.io.*;
import java.util.Scanner;

public class FileDemo {
    Scanner s;
    int[] marks;

    FileDemo(){
        s = new Scanner(System.in);
    }

    public void writeFile(){
        PrintWriter p;
        int n;
        System.out.println("How many numbers do you want to enter");
        n = s.nextInt();
        marks = new int[n];
        for (int i = 0; i < marks.length; i++){
            System.out.println("Enter a mark:");
            marks[i] = s.nextInt();
        }

        try{
            s.nextLine();
            String name;
            System.out.println("Enter the name of the file");
            name = s.nextLine();

            Boolean write;
            System.out.println("Enter options for the file:");
            System.out.println("true - append data");
            System.out.println("false - replace data");
            write = s.nextBoolean();
    
            p = new PrintWriter(new FileWriter(name, write));
            for(int i = 0; i< marks.length; i++){
                p.println(marks[i]);
            }
            p.close();
        } catch(Exception e){
            System.out.println("File could not be created");
        }
    }

    public static void main(String[] args) {
        FileDemo f = new FileDemo();
        f.writeFile();
    }
}
