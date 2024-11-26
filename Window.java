import java.util.Scanner;

public class Window{
   Scanner s;
   String word;
   String word2;
   int repeat;

   Window(){
      s = new Scanner(System.in);
   }

   public void method(){
      word = s.nextLine();
      word2 = s.nextLine();
      repeat = s.nextInt();

      for (int i = 0; i < repeat-1; i++){
         System.out.printf("%s", word);
         System.out.printf("%s", word2);
      }
      System.out.printf("%s", word);
   }
   
   public static void main (String[] args){
      Window w = new Window();
      w.method();
   }
}