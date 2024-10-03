import java.util.Scanner;

public class input {

    Scanner s;
    input(){
        s = new Scanner (System.in);
    }

    public char getChoice(){
        char choice = 'x';
        do{
            try {
                choice = s.nextLine().charAt(0);
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
            
        } while (choice != 'l' || choice != 'L' || choice != 'n' || choice != 'N' || choice != 'w' || choice != 'W');
        return choice;
    }

    public double length(){
        double len = 0.0;
        do{
            try {
                len = s.nextDouble();
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (len <= 0);
        return len;
    }

    public int harmonicNum(){
        int num = 0;
        do {
            try {
                num = s.nextInt();
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (num <= 0);
        return num;
    }

    public double wavelength(){
        double len = 0.0;
        do {
            try {
                len = s.nextDouble();
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid value");
            }
        } while (len <= 0);
        return len;
    }
}
