import java.awt.event.*;
import javax.swing.*;

import graphics_local.*;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;

public class Scene1 {

    Color black = new Color(0, 0, 0);
    Color grey = new Color(171, 171, 171);
    Color sky = new Color(79, 176, 255);
    Color dark_grey = new Color(99, 99, 99);
    Color green = new Color(94, 222, 69);

    Scene1(){
        Canvas.setSize(800, 500);

    }

    public void runway(){
        Rectangle r = new Rectangle(0, 400, 820, 4);
        r.setColor(black);
        r.fill();
        Rectangle r2 = new Rectangle(0, 450, 820, 4);
        r2.setColor(black);
        r2.fill();

        for (int i = 0; i <= 850; i+=50){
            Rectangle r3 = new Rectangle(i, 425, 30, 3);
            r3.setColor(black);
            r3.fill();
        }
    }

    public void background(){
        runway();
        Rectangle r = new Rectangle(0, 454, 820, 70);
        r.setColor(green);
        r.fill();
        Rectangle r2 = new Rectangle(0, 0, 820, 4);
        r2.setColor(black);
        r2.fill();

    }
    public static void main(String[] args) throws Exception {
        Scene1 s = new Scene1();
        s.background();
    }
}
