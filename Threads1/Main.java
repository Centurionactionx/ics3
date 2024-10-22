/*
Author: Mr. Guglielmi
Date: 26/10/2023
Description: This is the main method for the Thread projecr. It creates instances of the two animation and starts them running
*/

import graphics.*;
public class Main{

	public static void main (String[] args){
	 
		Canvas.setSize (800, 500); //set the screen size
		Animate a = new Animate(); //create an instance of animate
		Animate2 a2 = new Animate2(); //create an instance of animate2
	
		a.start(); //start the first thread
		try {
			a.join(); //sync the thread so the next thread doesn't start until this one finishes
		}
		catch (Exception e){}
		a2.start(); //start the second thread. 
		
		//note, without join(), all threads started will start at the same time
	}
}