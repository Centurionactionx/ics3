/*
Author: Mr. Guglielmi
Date: 26/10/2023
Description: This program implements a clock which counts up by seconds.
*/

public class Clock extends Thread{

	int time; //feild for the current time value
	boolean isRunning; //flag for running
	
	//default constructor starting the timer at 0 seconds
	Clock (){
		time = 0;
		isRunning = true;
	}
	
	//constructor allowing for the timer to start at the specified time
	Clock (int n){
		time = n;
		isRunning = true;
	}
	
	//method which stops the timer and ends the thread
	public void stopTimer(){
		isRunning = false;
	}
	
	//run method
	public void run(){
	//keep timing until told to stop
		while (isRunning){
			time++; 
			System.out.println (time);
			
			try{
				sleep(1000); //wait 1 second
			}
			catch (Exception e){}
		}
	}
}