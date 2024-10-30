
/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Descriptiono: a program that displays the second scene of the airplane animation
 */

import graphics.*;

public class Scene2 {

    Scene2(){
        Canvas.setSize(800, 500);
    }

    public void runthreats(){ //plane flying
        Flying f = new Flying();

        f.start();
    }

}
