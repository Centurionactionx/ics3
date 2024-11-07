/*
Author: Mr. Guglielmi
Date: 16/11/2023
Description: This program demonstrates writing to files
*/
import java.io.*;
import java.util.Scanner;

public class FileWriteDemo{
	
	String line, filename;
	Scanner s;
	int nums[];
	int avg;

	String[] data;

	FileWriteDemo(){
		s = new Scanner(System.in);
	}
	
	
	public void askData(){
		 System.out.println ("Enter some text:");
		 line = s.nextLine();
		 System.out.println ("Enter the file name");
		 filename = s.nextLine();
	 }
	 
	 public void writeFile(){
		 
		 PrintWriter p; //variable for the file writer object
		 
		 try{
		 	//initialize the printwriter
			 p = new PrintWriter (new FileWriter(filename, false)); //filewriter has two modes: false - overwrite, true - append
			 p.println (line); //write the data to the file
			 p.close(); //close the file and save the data
		 }
		 catch (Exception e){
			 System.out.println ("Error, file cannot be created or found");
		 }
	 }

	 public void readFile(){
		File f;
		Scanner a;

		try {
			f = new File("Marks.txt");
			a = new Scanner (f);
			data = new String[filesize(f)];

			String line;
			int index = 0;
			while(a.hasNextLine()){
				line = a.nextLine();
				// System.out.println(line);
				data[index] = line;
				index++;
			}
		} catch (Exception e) {
			System.out.println("File not found");
		}
	 }

	 private int filesize(File f){
		int count = -1;

		try {
			Scanner a = new Scanner (f);
			count = 0;
			while(a.hasNextLine()){
				a.nextLine();
				count++;
			}
			a.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	 }
	 
	 public void calculateAvg(){

		int marks[];
		
		for(int i = 0; i < data.length; i+=6){
			System.out.println(data[i]);
			marks = new int[5];
			for (int a = 1; a<5; a++){
				marks[a-1] = Integer.parseInt(data[a+i]);
			}

			for(int n:marks){
				avg += n;
			}
			System.out.printf("The average is %d%n", avg/5);
			avg = 0;
		}
	 }

	 public static void main (String[] args){
		 FileWriteDemo f = new FileWriteDemo ();
		//  f.askData();
		 f.readFile();
		 f.calculateAvg();
	 }
	 
 }