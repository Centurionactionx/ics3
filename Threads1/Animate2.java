/*
Author: Mr. Guglielmi
Date: 26/10/2023
Description: This thread animates a blue square moving 700 pixels across the screen
*/

import graphics.*;
public class Animate2 extends Thread{

	Animate2 (){
	
	}
	
	private void draw(){
	//draw the square
		Rectangle r = new Rectangle (10, 400, 50, 50);
		r.setColor (Color.BLUE);
		r.fill();
		
		Clock c = new Clock(40); //create a new clock starting at 40 seconds
		c.start();//start the clock
		for (int i = 0; i < 700; i++){
			r.translate (1, 0);
			try {
				sleep (25); //time the animation
			}
			catch (Exception e){}
		}
		c.stopTimer(); //stop the clock when the animation is finished
	}
	
	//run method
	public void run(){
		draw();
	}
}