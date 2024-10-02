import graphics.*;

public class MyOutput{

    int d;
    MyOutput(){
      //no initialization needed
    }
  
    public void output (){
      d = 5/2;
      System.out.println(d);
    }
  
    public static void main (String[] args){
      MyOutput m = new MyOutput();
      m.output();
    }
  
  }
    