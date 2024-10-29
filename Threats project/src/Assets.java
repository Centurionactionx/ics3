/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: The class that contains all assets for the project
 */

import java.util.Random;
import graphics.*;

public class Assets {

    Color space = new Color(155, 135, 222);
    Color grey = new Color(171, 171, 171);
    Color blue = new Color(79, 176, 255);
    Color dark_grey = new Color(99, 99, 99);
    Color green = new Color(94, 222, 69);
    Color night = new Color(14,38,125);
    Color dark_green = new Color(63, 148, 46);
    Rectangle body;
    Rectangle sky;
    Rectangle ground;
    Rectangle sunline1;
    Rectangle sunline2;
    Rectangle sunline3;
    Ellipse nose;
    Ellipse nose2;
    Ellipse rear;
    Ellipse tail;
    Ellipse wing;
    Ellipse wheel1;
    Ellipse wheel2;
    Ellipse sun;
    Ellipse earth;
    Ellipse c1;
    Ellipse c2;
    Ellipse c3;
    Ellipse e;

    Random rand = new Random();

    public void runway(){
        Rectangle r4 = new Rectangle(0, 404, 820, 46);
        r4.setColor(Color.WHITE);
        r4.fill();
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
        sky = new Rectangle(0,0, 820, 400);
        sky.setColor(blue);
        sky.fill();
        ground = new Rectangle(0, 454, 820, 70);
        ground.setColor(green);
        ground.fill();
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
        body.setColor(dark_grey);
        body.fill();
        
        nose = new Ellipse(x + 80, y, 40, 40);
        nose.setColor(dark_grey);
        nose.fill();
        
        nose2 = new Ellipse(x + 90, y + 15, 40, 25);
        nose2.setColor(dark_grey);
        nose2.fill(); 
        
        rear = new Ellipse(x - 37, y, 60, 40);
        rear.setColor(dark_grey);
        rear.fill();
        
        tail = new Ellipse(x - 30, y - 17, 20, 35);
        tail.setColor(dark_grey);
        tail.fill();
        
        wing = new Ellipse(x + 28, y - 40, 30, 130);
        wing.setColor(dark_grey);
        wing.fill();
  
        wheel1 = new Ellipse(x + 5, y + 45, 15, 15);
        wheel1.setColor(dark_grey);
        wheel1.fill();
        
        wheel2 = new Ellipse(x + 85, y + 45, 15, 15);
        wheel2.setColor(dark_grey);
        wheel2.fill();
  
     }
  
    public void sun(){
        sun = new Ellipse(-75, -75, 150, 150);
        sunline1 = new Rectangle(-100, -100, 40, 5);
        sunline2 = new Rectangle (75, 75, 5, 40);
        sunline3 = new Rectangle (35, 75, 5, 40);

        sun.setColor(Color.YELLOW);
        sunline1.setColor(Color.YELLOW);
        sunline2.setColor(Color.YELLOW);
        sunline3.setColor(Color.YELLOW);

        sun.fill();
        sunline1.fill();
        sunline2.fill();
        sunline3.fill();

    }

    public void cloud1(){
        c1 = new Ellipse(100, 100, 100, 60);
        c1.setColor(Color.WHITE);
        c1.fill();
        
        c2 = new Ellipse(150, 100, 100, 60);
        c2.setColor(Color.WHITE);
        c2.fill();
        
        c3 = new Ellipse(125,75, 100, 60);
        c3.setColor(Color.WHITE);
        c3.fill();
      }
  
    public void earth(){
        // Body
        earth = new Ellipse(-100, 400, 1000, 200);
        earth.setColor(blue);
        earth.fill();

        // Continents
        Ellipse America = new Ellipse(150, 420, 50, 70);
        Ellipse Africa = new Ellipse(500, 450, 70, 90);
        Ellipse Europe = new Ellipse(520, 410, 90, 50);
        Ellipse Asia = new Ellipse(570, 430, 120, 80);
        
        America.setColor(Color.GREEN);
        Africa.setColor(Color.GREEN);
        Europe.setColor(Color.GREEN);
        Asia.setColor(Color.GREEN);
        
        America.fill();
        Africa.fill();
        Europe.fill();
        Asia.fill();
    }

    public void space(){
        Rectangle sky = new Rectangle(0,0,900, 600);
        sky.setColor(space);
        sky.fill();
    }

    public void buildings(){

        for (int i = 0; i <= 850; i+=50){
            int rand_height = rand.nextInt(3);
            Rectangle b1 = new Rectangle(i, 400-(rand_height+1)*50, 50, (rand_height+1)*50);
            b1.setColor(Color.BLACK);
            b1.fill();
        }
        
      }

    public void moon(){
        e = new Ellipse(100, 100, 50, 50);
        e.setColor(Color.WHITE);
        e.fill();
        
    }
}
