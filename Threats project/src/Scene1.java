
/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Descriptiono: a program that displays the first scene of the airplane animation
 */
import java.awt.event.*;
import javax.swing.*;

import graphics_local.*;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;

public class Scene1 {

    Assets a = new Assets();

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

        // Cloud
        a.cloud1(100, 100);
        a.cloud1(300, 100);
        a.cloud1(600, 100);
    }

  
    public void runthreats(){
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
    

    public static void main(String[] args) throws Exception {
        Scene1 s = new Scene1();
        s.background();
        s.runthreats();
    }
}
