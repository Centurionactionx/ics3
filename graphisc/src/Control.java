/*
 * Name: Joseph Wang
 * Date: October 17 2024
 * Description: A program that lets you move a rectangle in all four directions for the GUI practice activity.
 */

 
import graphics.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;

public class Control {
    JFrame f;
    JButton up, down, left, right, stop;
    Rectangle r;
    int x = 0;
    int y = 0;

    Control(){

        Canvas.setSize(600, 600);
        r = new Rectangle(50,50,100,50);
        r.setColor(Color.RED);
        r.fill();

        f = new JFrame();
        up = new JButton("UP");
        up.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                y = -10;
                x = 0;
            }
        }
        );

        down = new JButton("DOWN");
        down.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                y = 10;
                x = 0;
            }
        }
        );

        left = new JButton("LEFT");
        left.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x = -10;
                y = 0;
            }
        }
        );

        right = new JButton("RIGHT");
        right.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x = 10;
                y = 0;
            }
        }
        );

        stop = new JButton("STOP");
        stop.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x = 0;
                y = 0;
            }
        }
        );

        f.add(up, BorderLayout.NORTH);
        f.add(down, BorderLayout.SOUTH);
        f.add(left, BorderLayout.WEST);
        f.add(right, BorderLayout.EAST);
        f.add(stop, BorderLayout.CENTER);

        f.setBounds (100, 100, 500, 200); 
        f.setResizable(false);
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
        f.setVisible (true); 
    }

    public void display(){
        while(true){
            r.translate(x, y);
            try{
                Thread.sleep(35);
            } catch(Exception e){
                
            }
        }
    }
    public static void main(String[] args) {
        Control c = new Control();
        c.display();
    }
}
