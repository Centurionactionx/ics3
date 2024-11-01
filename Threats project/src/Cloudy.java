/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: Handles the cloud animations for the first scene. Includes an overload method for cloud location
 */

import graphics.Color;
import graphics.Ellipse;

public class Cloudy extends Thread{

    Ellipse c1;
    Ellipse c2;
    Ellipse c3;
    Cloudy(){ //draws clouds
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

    Cloudy(int x, int y, Color c){ //draws clouds
        c1 = new Ellipse(x, y, 100, 60);
        c1.setColor(c);
        c1.fill();
        
        c2 = new Ellipse(x+50, y, 100, 60);
        c2.setColor(c);
        c2.fill();
        
        c3 = new Ellipse(x+25,y-25, 100, 60);
        c3.setColor(c);
        c3.fill();
    }
    Assets a = new Assets();

    public void run(){ //moves clouds
        for(int i = 500; i < 950; i+=1){
            try {
                c1.translate(2, 0);
                c2.translate(2, 0);
                c3.translate(2, 0);
                Thread.sleep(29);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}