import java.util.Scanner;
public class Loop_Practice2{
  Scanner s;

  //add this field
  int num;
  
  Loop_Practice2(){
	s = new Scanner(System.in);
  }

  public void display(){

    for (int i = 50; i >= 30; i-=3){
      System.out.println (i);
    }

  }

  public static void main (String[] args){
    Loop_Practice2 f = new Loop_Practice2();
    f.display();
  }
}

  