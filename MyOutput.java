public class MyOutput{

    MyOutput(){
      //no initialization needed
    }
  
    public void output (){
      String h1 = "Fruits";
      String h2 = "Veggies";
      String h3 = "Snacks";
      System.out.printf("%s%10s%10s", h1, h2, h3);
      System.out.printf("%n%3d%10d%10d", 1, 2, 3);
      System.out.printf("%n%3d%10d%10d", 2, 3, 4);
      System.out.printf("%n%3d%10d%10d", 3, 4, 5);

      System.out.printf("%n%32s", "&");
      System.out.printf("%n%31s%2s", "&", "&");
      System.out.printf("%n%30s%4s", "&", "&");
      System.out.printf("%n%29s%6s", "&", "&");
      System.out.printf("%n%28s%8s", "&", "&");
      System.out.printf("%n%27s%10s", "&", "&");
      System.out.printf("%n%26s%12s", "&", "&");
      System.out.printf("%n%25s%14s", "&", "&");
      System.out.printf("%n%24s%16s", "&", "&");
      System.out.printf("%n%24s%16s", "&", "&");
      System.out.printf("%n%24s%16s", "&", "&");
      System.out.printf("%n%24s%16s", "&", "&");
      System.out.printf("%n%24s%16s", "&", "&");
      System.out.printf("%n%24s%16s", "&", "&");
      System.out.printf("%n%40s", "&&&&&&&&&&&&&&&&&");
    }
  
    public static void main (String[] args){
      MyOutput m = new MyOutput();
      m.output();
    }
  
  }
    