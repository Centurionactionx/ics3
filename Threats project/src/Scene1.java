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

    public void takeoff(){
        a.drawPlane(100, 375);
        for (int i = 100; i <= 500; i+=5){
            try {

                a.body.translate(5, -3);
                a.nose.translate(5, -3);
                a.nose2.translate(5, -3);
                a.rear.translate(5, -3);
                a.tail.translate(5, -3);
                a.wing.translate(5, -3);
                a.wheel1.translate(5, -3);
                a.wheel2.translate(5, -3);

                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        for (int i = 500; i <= 850; i+=5){
            try {

                a.body.translate(7, 0);
                a.nose.translate(7, 0);
                a.nose2.translate(7, 0);
                a.rear.translate(7, 0);
                a.tail.translate(7, 0);
                a.wing.translate(7, 0);
                a.wheel1.translate(7, 0);
                a.wheel2.translate(7, 0);

                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void goodmorning(){
        a.sun();
        // for(int i = 500; i < 850; i+=3){
        //     a.e2.translate(3, 0);
        // }
    }

    public static void main(String[] args) throws Exception {
        Scene1 s = new Scene1();
        s.background();
        s.takeoff();
        s.goodmorning();
    }
}
