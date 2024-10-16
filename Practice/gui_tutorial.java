import java.awt.*;
import grahpisc;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;

public class gui_tutorial {
    JFrame f; //the main window frame
    JPanel buttonPanel; //for the button
    JPanel textPanel; //for the label
    JButton b, b2, b3, b4; //the button itself
    JLabel l; //the text label itself

    gui_tutorial(){
        //initialize the panels
        buttonPanel = new JPanel();
        textPanel = new JPanel();

        l = new JLabel ("Hello world");
        b = new JButton ("Click here");

        b.addActionListener ( new ActionListener(){
            public void actionPerformed (ActionEvent e){
              buttonClicked();
            }
          }
        );

        b2 = new JButton("Click here");
        b2.addActionListener ( new ActionListener(){
            public void actionPerformed (ActionEvent e){
              button2Clicked();
            }
          }
        );

        textPanel.add (l);
        buttonPanel.add (b);
        buttonPanel.add (b2);

        f = new JFrame ("Basic GUI");
        f.add (textPanel, BorderLayout.NORTH);
        f.add (buttonPanel, BorderLayout.SOUTH);

        f.setBounds (100, 100, 500, 200); //arguments for x, y (location on the desktop) and the width and height of the window
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //setting so the program ends when the window is closed
        f.setVisible (true); //make the frame visible

         //closing bracket for the constructor opened earlier in the tutorial
    }

    private void button2Clicked(){
        String temp  = JOptionPane.showInputDialog(f, "Enter words");
        l.setText(temp);
    }

    private void buttonClicked(){
        l.setText ("You clicked the button");
    }

    public static void main(String[] args) {
        gui_tutorial g = new gui_tutorial();
    }
}
