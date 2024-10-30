//Sean Wu and Joeseph Wang
//October 29
//this file runs the GUI

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI{

  JFrame f; //the main window frame
  JButton scene1, scene2, scene3; //the button itself
  
  GUI(){ 
  scene1 = new JButton ("scene1");
  scene2 = new JButton ("scene2");
  scene3 = new JButton ("scene3");

  scene1.addActionListener ( new ActionListener(){ //button for scene 1

     public void actionPerformed (ActionEvent e){ 
        Scene1 s = new Scene1();
        Bg1 b = new Bg1();
        b.background(); //calls background
        s.runthreats(); //runs thread
     }
  }
);

   scene2.addActionListener ( new ActionListener(){ //buttonf or scene2

     public void actionPerformed (ActionEvent e){
         Scene2 s = new Scene2();
         Bg2 b = new Bg2();
         b.background(); //calls background
         s.runthreats(); //runs thread
     }
  }
);
   
   scene3.addActionListener ( new ActionListener(){ //button for scene3

     public void actionPerformed (ActionEvent e){
         Scene3 s = new Scene3();
         Bg3 b = new Bg3();
         b.background(); //calls background
         s.runthreats(); //runs thread
     }
  }
);

   //adds buttons to frame
   f = new JFrame ();
   f.add (scene1, BorderLayout.NORTH); 
   f.add (scene2, BorderLayout.CENTER);
   f.add (scene3, BorderLayout.SOUTH);

   f.setBounds (100, 100, 200, 200); //arguments for x, y (location on the desktop) and the width and height of the window
   f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //setting so the program ends when the window is closed
   f.setVisible (true); //make the frame visible

   }

   public static void main (String[] args){
      GUI w = new GUI();
   }

}