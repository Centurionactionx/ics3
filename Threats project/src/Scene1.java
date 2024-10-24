import java.awt.event.*;
import javax.swing.*;

import graphics_local.*;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;

public class Scene1 {

    Color grey = new Color(171, 171, 171);
    Color blue = new Color(79, 176, 255);
    Color dark_grey = new Color(99, 99, 99);
    Color green = new Color(94, 222, 69);
    Assets a = new Assets();
    // Assets a1 = new Assets();

    Scene1(){
        Canvas.setSize(800, 500);
    }

    public void background(){

        // Runway
        a.runway();

        // Sky and ground
        a.sky_ground();

        // Tower
        a.cTower();

        // Sun
        // a.sun();

    }

    public void runthreats(){
        
    }

    

    

    public static void main(String[] args) throws Exception {
        Scene1 s = new Scene1();
        s.background();
        Takeoff t = new Takeoff();
        Goodmorning g = new Goodmorning();

        t.start();
        g.start();
        try {
            g.join();
        } catch (Exception e) {
           // TODO: handle exception
         }
        
    }
}
