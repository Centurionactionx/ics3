import graphics.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;

public class Control {
    JFrame f;
    JButton up, down, left, right, stop;
    Rectangle r;
    int y = 0;
    int x = 0;

    Control(){
        Canvas.setSize(800, 500);
        Rectangle r = new Rectangle(50,50,100,50);
        r.setColor(Color.RED);
        r.fill();

        f = new JFrame();
        up = new JButton("UP");
        up.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                y = -10;
            }
        }
        );

        down = new JButton("DOWN");
        down.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                y = 10;
            }
        }
        );

        left = new JButton("LEFT");
        left.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x = -10;
            }
        }
        );

        right = new JButton("RIGHT");
        right.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x = 10;
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

        f.setBounds (100, 100, 500, 200); //arguments for x, y (location on the desktop) and the width and height of the window
        f.setResizable(false);
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //setting so the program ends when the window is closed
        f.setVisible (true); //make the frame visible
    }

    public void display(){
        while(1 == 1){
            r.translate(x, y);
        }
    }
    public static void main(String[] args) {
        Control c = new Control();
        c.display();
    }
}
