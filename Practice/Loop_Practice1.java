import java.util.Scanner;
public class Loop_Practice1{
  Scanner s;

  //add this field
  int num;
  
  Loop_Practice1(){
	s = new Scanner(System.in);
  }

  public void display(){

    for (int i = 0; i < 21; i+=2){
      System.out.println (i);
    }

  }

  public static void main (String[] args){
    Loop_Practice1 f = new Loop_Practice1();
    f.display();
  }
}

  