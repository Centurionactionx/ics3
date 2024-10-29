
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

    public void runthreats(){
        Flying f = new Flying();

        f.start();
        // try {
        //     g.join();
        // } catch (Exception e) {
        //    TODO: handle exception
        // }
    }

    // public static void main(String[] args) {
    //     Scene2 s = new Scene2();
    //     Bg2 b = new Bg2();
    //     b.background();
    //     s.runthreats();
    // }
}
