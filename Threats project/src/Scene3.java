/*
 * Name: Joseph Wang and Sean Wu
 * Date: October 28 2024
 * Description: a program that displays the third scene of the airplane animation
 */

import graphics.*;

public class Scene3 {
    
    Assets a = new Assets();

    Scene3(){
        Canvas.setSize(800, 500);
    }

    public void runthreats(){ //performs landing and moves moon
        Landing l = new Landing();
        Cheese c = new Cheese();

        l.start();
        c.start();
    }
}
