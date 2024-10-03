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
                // s.nextLine(); ask mr g

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
    public boolean isValidChoice(char choice) {
        return choice == 'l' || choice == 'L' || choice == 'n' || choice == 'N' || choice == 'w' || choice == 'W';
    }

    // Gets the length from the user.
    public double getLength(){
        double len = 0.0;
        do{
            try {
                len = s.nextDouble();
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (len <= 0); // Loops if the length entered is zero or negative
        return len;
    }

    // Gets the harmonic number from the user. 
    public int getHarmonic(){
        int num = 0;
        do {
            try {
                num = s.nextInt();
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (num <= 0); // Loops if the harmonic number entered is zero or negative
        return num;
    }

    // Gets the wavelength from the user
    public double getWavelen(){
        double len = 0.0;
        do {
            try {
                len = s.nextDouble();
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (len <= 0); // Loops if the wavelength entered is zero or negative
        return len;
    }
}
