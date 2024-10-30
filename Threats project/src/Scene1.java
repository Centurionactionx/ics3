/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: a program that displays the first scene of the airplane animation
 */

import graphics.*;

public class Scene1 {    

    Scene1(){
        Canvas.setSize(800, 500);
    }

  
    public void runthreats(){ //draws scene 1 background
        Takeoff t = new Takeoff();
        Goodmorning g = new Goodmorning();
        Cloudy c = new Cloudy();
        Cloudy c2 = new Cloudy(300, 100);
        Cloudy c3 = new Cloudy(500, 100);

        // Starts the takeoff
        t.start();

        // Starts moving the sun and clouds
        g.start();
        c.start();
        c2.start();
        c3.start();
        
    }

}