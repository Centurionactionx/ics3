import java.util.Scanner;

public class Scanner_testing {
    
    Scanner s;
    String word1;
    String word2;


    Scanner_testing(){
        s = new Scanner (System.in);
    }

    public void askData(){
        System.out.println("Enter the first word");
        word1 = s.nextLine();
        System.out.println("Enter the second word");
        word2 = s.nextLine();
    }

    public void display(){
        System.out.printf("%s %s", word1, word2);
    }

    public static void main(String[] args) {
        Scanner_testing m = new Scanner_testing();
        m.askData();
        m.display();
    }


}
