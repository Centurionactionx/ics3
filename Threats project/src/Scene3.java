/*
 * Name: Joseph Wang and Sean Wu
 * Date: October 28 2024
 * Description: a program that displays the third scene of the airplane animation
 */

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import graphics_local.*;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;


public class Scene3 {
    
    Assets a = new Assets();

    Scene3(){
        Canvas.setSize(800, 500);
    }

    public void background(){
        a.runway();
        a.sky_ground();
        a.sky.setColor(a.night);
        a.ground.setColor(a.dark_green);

        a.buildings();
    }

    public void runthreats(){
        Landing l = new Landing();

        l.start();
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        Scene3 s = new Scene3();
        s.background();
        s.runthreats();
    }
}
