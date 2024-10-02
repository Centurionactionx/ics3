import graphics.*;

public class Window{

   Window(){
      Canvas.setSize(800, 500);
   }

   public void draw(){
      Rectangle r = new Rectangle(100, 100, 200, 100);
      r.setColor (new Color(255,24,144));
   }
   
   public static void main (String[] args){
      Window w = new Window();
      w.draw();
   }
}