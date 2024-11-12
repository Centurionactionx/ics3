/*
 * Author: Mr. Guglielmi
 * Date: 11/11/2024
 * Description: This class impliments a simple "monster" which could be used in a video game
 * */
 
 import java.io.*;
 import java.util.Scanner;
 import java.util.Random;
 import java.util.*;
 
 public class Monster{
	 String name;
	 int hp, magic;
	 int damage;
	 String[] data;
	 
	 Monster(){
		 
		 name = "Default";
		 hp = 10;
		 magic = 2;
		 damage = 0;
	 }
	 
	 Monster (String n, int h, int m){
		  name = n;
		 hp = h;
		 magic = m;
		 damage = 0;
	 }
	 
	 public boolean isAlive(){
		 return hp > damage;
	 }
	 
	 public int attack(){
		 Random r = new Random();
		 int temp = magic * r.nextInt (9) + 1;
		 magic--;
		 return temp;
	 }
	 
	 public void takeDamage (int d){
		 damage += d;
	 }
	 
	 //note: Monster file format is: "name",hp,magic
	 
	 //a method to get the stats of a monster from a file and set the fields accordingly
	 public void getStats (String filename){
		File f;
		Scanner a;
		try {
			f = new File(filename);
			a = new Scanner(f);
			data = new String[3];
			String line = a.nextLine();
			data = line.split(", ");
			name = data[0];
			hp = Integer.parseInt(data[1]);
			magic = Integer.parseInt(data[2]);
			damage = Integer.parseInt(data[3]);
			// }
			System.out.printf("%n %s's hp is %d and magic is %d and damage is %d", name, hp, magic, damage);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	 }
	 
	 //a method to save the current stats of a monster, less any damage, to a file
	 public void saveMonster (String filename){
		 PrintWriter p;

		 try {
			p = new PrintWriter(new FileWriter(filename, false));
			p.printf("%s, %d, %d, %d", name, hp, magic, damage);
			p.close();
		 } catch (Exception e) {
			System.out.println("File not found");
		 }
	 }
 }
