/*
 * Name: Joseph Wang
 * Date: October 8
 * Class: ICS3U
 * Description: This is the class that handles all inputs from the user, menu option inputs and variable values. 
 */

import java.util.Scanner;

// The class that handles all inputs from the user
public class input {
    Scanner s;
    input(){
        s = new Scanner (System.in);
    }

    // Gets the user's choice of variable from the menu
    public char getChoice(){
        char choice = 'x';
        do{
            try {
                choice = s.nextLine().charAt(0);

                // Checks if the choice entered is a valid choice from the menu
                if (!isValidChoice(choice)) {
                    System.out.println("Invalid choice");
                }
            } catch (Exception e) {  // Catches any exceptions that might happen
                System.out.println("Invalid input");
            }
        } while (!isValidChoice(choice)); // Loops until a valid choice is entered
        return choice;
    }

    // A method for checking for a valid choice
    private boolean isValidChoice(char choice) {
        return choice == 'l' || choice == 'L' || choice == 'n' || choice == 'N' || choice == 'w' || choice == 'W' || choice == 'q' || choice == 'Q';
    }

    public double getLength(){
        // Creates a temporary length string to convert to a double
        String len_temp = "";
        double len = 0.0;
        do{
            try {
                System.out.println("Enter the length:");
                len_temp = s.nextLine();
                len = Double.parseDouble(len_temp); // If the user enters a value that cannot be converted, an error will occur
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (len <= 0); // Loops if the length entered is zero or negative
        return len;
    }

    // Gets the harmonic number from the user. 
    public int getHarmonic(){
        // Creates a temporary harmonic number string to convert to an int
        String num_temp = "";
        int num = 0;
        do {
            try {
                System.out.println("Enter the harmonic number:");
                num_temp = s.nextLine();
                num = Integer.parseInt(num_temp); // If the user enters a value that cannot be converted, an error will occur
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (num <= 0); // Loops if the harmonic number entered is zero or negative
        return num;
    }

    // Gets the wavelength from the user
    public double getWavelen(){
        // Creates a temporary wavelength string to convert to a double
        String wavelen_temp = "";
        double wavelen = 0.0;
        do {
            try {
                System.out.println("Enter the wavelength:");
                wavelen_temp = s.nextLine();
                wavelen = Double.parseDouble(wavelen_temp); // If the user enters a value that cannot be converted, an error will occur
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (wavelen <= 0); // Loops if the wavelength entered is zero or negative
        return wavelen;
    }
}
