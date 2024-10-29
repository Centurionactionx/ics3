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

    public void runthreats(){
        Landing l = new Landing();
        Cheese c = new Cheese();

        l.start();
        c.start();
        try {
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // public static void main(String[] args) {
    //     Scene3 s = new Scene3();
    //     Bg3 b = new Bg3();
    //     b.background();
    //     s.runthreats();
    // }
}
