import java.util.Scanner;

public class DebugAct{

	Scanner s;
	int a, b, c;
	
	DebugAct(){
		s = new Scanner(System.in);
	}
	
	public void menu(){
	
		askData();
		
	}
	
	public void askData(){
		
		System.out.println ("Enter values for A, B, and C in the quadratic formula");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		display();
		
	}
	
	public void display(){
	
		double determ = b * b - 4 * a * c;
	
		double x1 = (-b + Math.sqrt (determ)) / 2 * a;
		double x2 = (-b - Math.sqrt (determ)) / 2 * a;
		
		System.out.printf ("The zeros are: x1 = %.2f and x2 = %.2f%n", x1, x2);
		
		askData();
	}
	
	public static void main(String[] args){
		  DebugAct d = new DebugAct();
		  d.menu();
	}
	
}