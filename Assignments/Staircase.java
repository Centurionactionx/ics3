/*
 * Name: Joseph Wang
 * Date: September 19 2024
 * Description: Prints a staircase of stars
 */

package Assignments;

public class Staircase {

    Staircase() {

    }

    public void display() {

        String space = " "; // creates a variable with the amount of spaces to indent
        for (int i = 1; i <= 18; i++) {
            System.out.printf("%s%s %n", space, "* * * * *"); // prints the spaces before the stars
            space = space + " "; // increments the number of spaces by 1
        }
    }

    public static void main(String[] args) {
        Staircase i = new Staircase();
        i.display();
    }
}
