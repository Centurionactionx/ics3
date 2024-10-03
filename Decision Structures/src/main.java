/*
 * Name: Joseph Wang
 * Date: October 3
 * Class: ICS3U
 * Description: A program that calculates the variable of choice in the standing wave equation with 2 fixed ends
 */

public class main {
    
    /*
     * Things to ask mr g:
     * 1. do the functions in the other classes need to be private
     * 2. that one thing in input
     */

    // Initiates all the classes
    menu m;
    input i;
    calculate c;

    main(){ // Constructor for all classes
        m = new menu();
        i = new input();
        c = new calculate();
    }

    // Calculates the length given the harmonic number and the wavelength
    public void length_calculation() { 
        System.out.println("Enter the harmonic number:");
        int harmonic_num = i.getHarmonic();
        System.out.println("Enter the wavelength:");
        double wavelen = i.getWavelen();
        double length = c.calculate_length(harmonic_num, wavelen);
        System.out.printf("The length is %f %n", length);
    }

    // Calculates the harmonic number given the length and wavelength
    public void harmonic_calculation() { 
        System.out.println("Enter the length:");
        double length = i.getLength();
        System.out.println("Enter the wavelength:");
        double wavelen = i.getWavelen();
        int harmonic_num = c.calculate_harmonic(length, wavelen);
        System.out.printf("The harmonic number is %d %n", harmonic_num);
    }

    // Calculates the wavelength given the harmonic number and length
    public void wavelength_calculation() {
        System.out.println("Enter the harmonic number:");
        int harmonic_num = i.getHarmonic();
        System.out.println("Enter the length:");
        double length = i.getLength();
        double wavelen = c.calculate_wavelength(harmonic_num, length);
        System.out.printf("The wavelength is %f %n", wavelen);
    }

    // Displays the menu and performs the user's choice of action
    public void display(){ 
        char choice = 'x';
        do {
            m.display();
            choice = i.getChoice();
            switch (choice) {
                case 'l':
                case 'L':
                    length_calculation();
                    break;
                case 'n':
                case 'N':
                    harmonic_calculation();
                    break;
                case 'w':
                case 'W':
                    wavelength_calculation();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.err.println(' ');
        } while (choice != 'q' && choice  != 'Q');
       
    }

    public static void main(String[] args) { // Main method
        main run = new main();
        run.display();
        
    }
}
