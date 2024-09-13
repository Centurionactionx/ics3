/*
 * Name: Joseph Wang
 * Date: September 13, 2024
 * Description: A program that prints my name in different ways
 */

package Assignments;

public class Name_Printer {
    // Defining first and last names
    String First_name = "Joseph";
    String Last_name = "Wang";

    Name_Printer(){}

    public void display_names(){ // Prints the first name in uppercase and last name in lowercase
        System.out.println(First_name.toUpperCase() + " " + Last_name.toLowerCase());
    }

    public void vertical_display(){ // Vertically displays each character of the first name in lowercase
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s", First_name.toLowerCase().charAt(0), First_name.toLowerCase().charAt(1), First_name.toLowerCase().charAt(2), First_name.toLowerCase().charAt(3), First_name.toLowerCase().charAt(4), First_name.toLowerCase().charAt(5));
    }

    public static void main(String[] args) {
        Name_Printer n = new Name_Printer();

        // Displays the first and last name before displaying the first name vertically
        n.display_names();
        n.vertical_display();
    }
}
