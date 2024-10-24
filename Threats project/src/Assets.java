import graphics_local.Color;
import graphics_local.Ellipse;
import graphics_local.Rectangle;
import graphics_local.*;

public class Assets {

    Color grey = new Color(171, 171, 171);
    Color blue = new Color(79, 176, 255);
    Color dark_grey = new Color(99, 99, 99);
    Color green = new Color(94, 222, 69);

    Rectangle body;
    Ellipse nose;
    Ellipse nose2;
    Ellipse rear;
    Ellipse tail;
    Ellipse wing;
    Ellipse wheel1;
    Ellipse wheel2;
    Ellipse sun;

    public void runway(){
        Rectangle r = new Rectangle(0, 400, 820, 4);
        r.setColor(Color.BLACK);
        r.fill();
        Rectangle r2 = new Rectangle(0, 450, 820, 4);
        r2.setColor(Color.BLACK);
        r2.fill();

        for (int i = 0; i <= 850; i+=50){
            Rectangle r3 = new Rectangle(i, 425, 30, 3);
            r3.setColor(Color.BLACK);
            r3.fill();
        }
    }

    public void sky_ground(){
        Rectangle sky = new Rectangle(0,0, 820, 400);
        sky.setColor(blue);
        sky.fill();
        Rectangle r = new Rectangle(0, 454, 820, 70);
        r.setColor(green);
        r.fill();
    }

    public void cTower(){
        Rectangle r3 = new Rectangle(550, 250, 50, 150);
        r3.setColor(dark_grey);
        r3.fill();
        for (int i = 553; i <= 595; i+=15){
            Rectangle r4 = new Rectangle(i, 285, 12, 9);
            r4.setColor(Color.WHITE);
            r4.fill();
        }
        Rectangle r5 = new Rectangle(574, 225, 2, 25);
        r5.setColor(dark_grey);
        r5.fill();
        Ellipse e = new Ellipse(560, 200, 30, 30);
        e.setColor(dark_grey);
        e.fill();
    }

    public void drawPlane(int x, double y){
        body = new Rectangle(x, y + 1, 100, 39);
        body.setColor(Color.BLACK);
        body.fill();
        
        nose = new Ellipse(x + 80, y, 40, 40);
        nose.setColor(Color.BLACK);
        nose.fill();
        
        nose2 = new Ellipse(x + 90, y + 15, 40, 25);
        nose2.setColor(Color.BLACK);
        nose2.fill(); 
        
        rear = new Ellipse(x - 37, y, 60, 40);
        rear.setColor(Color.BLACK);
        rear.fill();
        
        tail = new Ellipse(x - 30, y - 17, 20, 35);
        tail.setColor(Color.BLACK);
        tail.fill();
        
        wing = new Ellipse(x + 28, y - 40, 30, 130);
        wing.setColor(Color.BLACK);
        wing.fill();
  
        wheel1 = new Ellipse(x + 5, y + 45, 15, 15);
        wheel1.setColor(Color.BLACK);
        wheel1.fill();
        
        wheel2 = new Ellipse(x + 85, y + 45, 15, 15);
        wheel2.setColor(Color.BLACK);
        wheel2.fill();
  
     }
  
    public void sun(){
        sun = new Ellipse(-75, -75, 150, 150);
        sun.setColor(Color.YELLOW);
        sun.fill();
    }

    
    public void cloud1(){
        Ellipse c1 = new Ellipse(100, 100, 100, 60);
        c1.setColor(Color.WHITE);
        c1.fill();
        
        Ellipse c2 = new Ellipse(150, 100, 100, 60);
        c2.setColor(Color.WHITE);
        c2.fill();
        
        Ellipse c3 = new Ellipse(125, 75, 100, 60);
        c3.setColor(Color.WHITE);
        c3.fill();
      }
  
}
