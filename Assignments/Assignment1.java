/*
 * Author: Joseph Wang   
 * Date: September 5, 2024
 * Description: A simple design on the text console 
 */

public class Assignment1 {
    Assignment1(){}

    public void displayInfo(){ //This method prints the text information
        System.out.println("Hi my name is Joseph Wang");
        System.out.println("The date is currently September 5, 2024");
        System.out.println("Course code: ICS3UP");
    }

    public void displayImage(){ //This method prints the image of the ice cream
        //The below lines print the top of the ice cream
        System.out.printf("%n%68s", "(_)");
        System.out.printf("%n%69s", "(___)");
        System.out.printf("%n%70s", "(_____)");
        System.out.printf("%n%71s", "(_______)");
        System.out.printf("%n%72s", "(_________)");
        System.out.printf("%n%73s", "(___________)");
        System.out.printf("%n%74s", "(_____________)");
        System.out.printf("%n%75s", "(_______________)");
        System.out.printf("%n%76s", "(_________________)");
        System.out.printf("%n%77s", "(___________________)");
        System.out.printf("%n%78s", "(_____________________)");
        System.out.printf("%n%79s", "(_______________________)");
        System.out.printf("%n%80s", "(_________________________)");

        //The below lines print the cone of the ice cone
        System.out.printf("%n%83s", "__(___________________________)_");
        System.out.printf("%n%51s%32s", "\\","/");
        System.out.printf("%n%52s%30s", "\\","/");
        System.out.printf("%n%53s%28s", "\\","/");
        System.out.printf("%n%54s%26s", "\\","/");
        System.out.printf("%n%55s%24s", "\\","/");
        System.out.printf("%n%56s%22s", "\\","/");
        System.out.printf("%n%57s%20s", "\\","/");
        System.out.printf("%n%58s%18s", "\\","/");
        System.out.printf("%n%59s%16s", "\\","/");
        System.out.printf("%n%60s%14s", "\\","/");
        System.out.printf("%n%61s%12s", "\\","/");
        System.out.printf("%n%62s%10s", "\\","/");
        System.out.printf("%n%63s%8s", "\\","/");
        System.out.printf("%n%64s%6s", "\\","/");
        System.out.printf("%n%65s%4s", "\\","/");
        System.out.printf("%n%67s%s", "\\_","/");
    }

    public static void main(String[] args) { 
        Assignment1 a = new Assignment1();

        //Displays the information
        a.displayInfo();

        //Displays the image
        a.displayImage();
    }
}
