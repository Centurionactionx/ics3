
/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Descriptiono: a program that displays the second scene of the airplane animation
 */

import java.awt.event.*;
import javax.swing.*;

import graphics_local.*;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;

public class Scene2 {
    
    Assets a = new Assets();

    Scene2(){
        Canvas.setSize(800, 500);
    }

    public void background(){
        a.space();
        a.earth();
    }

    public void runthreats(){
        Flying f = new Flying();
        // Goodmorning g = new Goodmorning();

        f.start();
        // g.start();
        // try {
        //     g.join();
        // } catch (Exception e) {
        //    TODO: handle exception
        // }
    }

    public static void main(String[] args) {
        Scene2 s = new Scene2();
        s.background();
        s.runthreats();
    }
}
