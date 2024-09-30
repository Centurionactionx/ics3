/*
 * Name: Joseph Wang
 * Date: September 30 2024
 * Class: ICS3U
 * Description: Multi purpose program of options
 */

import java.util.Scanner;

public class Decisions {
    
    //init
    int choice;
    Scanner s;
    Decisions(){
        s = new Scanner (System.in);
    }

    public void math_question(){ //First option: math question
        System.out.println("Your question is:");
        System.out.println("11 x 30 / 10 x 50 / 7 x 14 / 6");
        int ans = s.nextInt();
        if (ans == 550){
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
    }

    public void multiple_question(){ //Second option: Multiple choice trivia question
        System.out.println("Who is generally considered the inventor of the motor car?");
        System.out.println("a - Henry Ford");
        System.out.println("b - Karl Benz");
        System.out.println("c - Henry M. Leland");
        char ans = s.nextLine().charAt(0);
        if (ans == 'b'){
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
    }

    public void madlibs(){ //Third option: madlibs sentence
        System.out.println("Enter a noun");
        String noun1 = s.nextLine();
        System.out.println("Enter another noun");
        String noun2 = s.nextLine();
        System.out.println("Enter a verb in past tense");
        String verb1 = s.nextLine();
        System.out.printf("The %s %s the %s because the %s didn't really like the %s", noun1, verb1, noun2, noun1, noun2 );
    }

    public void menu(){ //The menu of options
        System.out.println("Choose an option from the numbers:");
        System.out.println("1 - Skill testing math question");
        System.out.println("2 - Multiple Choice Question");
        System.out.println("3 - Mad libs");
    }

    public void getChoice(){ //Get's the menu choice of the user 
        choice = s.nextInt();
        s.nextLine();
        make_decision(choice);
    }

    public void make_decision(int choice){ //Makes the decision and calls the respective method
        if (choice == 1){
            math_question();
        } else if (choice == 2){
            multiple_question();
        } else if (choice == 3){
            madlibs();
        } else {
            System.out.println("Not a menu option");
        }
    }

    public static void main(String[] args) {
        Decisions d = new Decisions();
        d.menu();
        d.getChoice();
    }
}
