/*
 * Name: Joseph Wang
 * Date: October 3
 * Class: ICS3U
 * Description: A program that calculates the variable of choice in the standing wave equation with 2 fixed ends
 */

public class main {

    // Initiates all the classes
    menu m;
    input i;
    calculate c;

    double length;
    int harmonic_num;
    double wavelen;

    main(){ // Constructor for all classes
        m = new menu();
        i = new input();
        c = new calculate();
    }

    // Calculates the length given the harmonic number and the wavelength
    public void length_calculation() { 
        double wavelen = i.getWavelen();
        int harmonic_num = i.getHarmonic();
        length = c.calculate_length(harmonic_num, wavelen);
    }

    // Calculates the harmonic number given the length and wavelength
    public void harmonic_calculation() { 
        double length = i.getLength();
        double wavelen = i.getWavelen();
        harmonic_num = c.calculate_harmonic(length, wavelen);
    }

    // Calculates the wavelength given the harmonic number and length
    public void wavelength_calculation() {
        double length = i.getLength();
        int harmonic_num = i.getHarmonic();
        wavelen = c.calculate_wavelength(harmonic_num, length);
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
                    System.out.printf("The length is %.2f %n", length);
                    break;
                case 'n':
                case 'N':
                    harmonic_calculation();
                    System.out.printf("The harmonic number is %d %n", harmonic_num);
                    break;
                case 'w':
                case 'W':
                    wavelength_calculation();
                    System.out.printf("The wavelength is %.2f %n", wavelen);
                    break;
                case 'q':
                case 'Q':
                    System.out.println("Exiting");
                    break;
            }
            System.out.println();
        } while (choice != 'q' && choice  != 'Q');
    }

    public static void main(String[] args) { // Main method
        main run = new main();
        run.display();
    }
}
