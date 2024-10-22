/*
Author: Mr. Guglielmi
Date: 26/10/2023
Description: This thread animates a red square moving 500 pixels across the screen
*/

import graphics.*;
public class Animate extends Thread{

	Animate (){
	
	}
	//method to create animation
	private void draw(){
	//create a red square
		Rectangle r = new Rectangle (10, 200, 50, 50);
		r.setColor (Color.RED);
		r.fill();
		Clock c = new Clock(); //create a new clock
		c.start();//start the clock
		
		//animate the square moving across the screen
		for (int i = 0; i < 500; i++){
			r.translate (1, 0);
			try {
				sleep (75); //slow the animation so it is visible
			}
			catch (Exception e){}
		}
		c.stopTimer(); //stop the timer when amimation is finished
	}
	
	//run method
	public void run(){
		draw();
	}
}