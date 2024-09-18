import java.util.Scanner;

public class Scanner_Practice2 {
    
    Scanner s;
    String word1;
    String word2;
    String word3;

    Scanner_Practice2(){
        s = new Scanner (System.in);
    }

    public void askData(){
        System.out.println("Enter your name");
        word1 = s.nextLine();
        System.out.println("Enter a verb in past tense");
        word2 = s.nextLine();
        System.out.println("Enter an object");
        word3 = s.nextLine();
    }

    public void display(){
        System.out.printf("%s went to the diddy party and %s the %s ", word1, word2, word3);
    }

    public static void main(String[] args) {
        Scanner_Practice2 m = new Scanner_Practice2();
        m.askData();
        m.display();
    }


}
