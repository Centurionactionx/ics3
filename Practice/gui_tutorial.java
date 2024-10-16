import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui_tutorial {
    JFrame f; //the main window frame
    JPanel buttonPanel; //for the button
    JPanel textPanel; //for the label
    JButton b, b2, b3; //the button itself
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

        textPanel.add (l);
        buttonPanel.add (b);

        f = new JFrame ("Basic GUI");
        f.add (textPanel, BorderLayout.NORTH);
        f.add (buttonPanel, BorderLayout.SOUTH);

        f.setBounds (100, 100, 200, 200); //arguments for x, y (location on the desktop) and the width and height of the window
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //setting so the program ends when the window is closed
        f.setVisible (true); //make the frame visible

         //closing bracket for the constructor opened earlier in the tutorial
    }

    private void buttonClicked(){
        l.setText ("You clicked the button");
    }

    public static void main(String[] args) {
        gui_tutorial g = new gui_tutorial();
    }
}
