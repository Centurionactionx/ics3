/*
* Date: February 19th, 2025
* Names: Mark Danishevsky and Joseph Wang
* For: Ms. Krasteva (ICS4UP1 [S2])
* Title: OOP 2 Original object class and subclass: "Item and Universal Finder"
* Description: This is the driver class for a program meant to demonstrate the functionality of our ItemFinder class
*              (superclass) and our UniversalItemFinder class (extended class).
* */

// Main class for demonstration
public class Main {
    private static String padding(String content, String paddingChar, int spaceToFill) {
        int rPadding = (int) Math.ceil((spaceToFill - content.length()) / 2.0); //length of space padding right of text
        int lPadding = (spaceToFill - content.length()) - rPadding; //left padding
        return paddingChar.repeat(lPadding) + content + paddingChar.repeat(rPadding);
    }

    private static void printBox(String title, String content) {
        final int INTERNAL_WIDTH = 73;
        final String TOP = "+" + padding(title, "-", INTERNAL_WIDTH) + "+";
        final String BOTTOM = "+" + "-".repeat(INTERNAL_WIDTH) + "+";

        System.out.println(TOP);

        String toPrint = "";
        for (String word : content.split(" ")) {
            if (toPrint.length() + word.length() > (INTERNAL_WIDTH - 2)) {
                System.out.println("| " + toPrint + " ".repeat(INTERNAL_WIDTH - toPrint.length() - 1) + "|");
                toPrint = "";
            }
            toPrint += word + " ";
        }
        System.out.println("| " + toPrint + " ".repeat(INTERNAL_WIDTH - toPrint.length() - 1) + "|");

        System.out.println(BOTTOM);
    }

    public static void main(String[] args) {
        // Finder 1
        // Creating an object using the parameterized constructor
        UniversalItemFinder finder1 = new UniversalItemFinder("Banana", 1000000, 1.5, "Toronto", "Object",
                "InHomes", 600, true, "Sweeping", 85, "BANANA-800",
                1000, "3.15", "2025-02-19", "BANANA-3400x",
                "Planana Inc", "PLNNA-9000-30x", "General purpose", 30, "Canada");

        // Display initial state
        System.out.println();
        printBox("Finder 1 Initial State", finder1.toString());
        System.out.println();

        // Modify attributes and behaviors for Finder 1
        System.out.println("--> Increasing the item count to 5, moving the location to New York, setting the finder type to 'Industrial' and setting the scanning range to 900m...");
        finder1.increaseItemCount(5); // Assuming this method exists in ItemFinder
        finder1.moveLocation("New York"); // Assuming this method exists in ItemFinder
        finder1.setFinderType("Industrial");
        finder1.setScanRange(900);

        // Display the updated state
        printBox("Finder 1 Updated State", finder1.toString());
        System.out.println();

        // Modify attributes and behaviors for Finder 1
        System.out.println("--> Deactivating the finder, switching the scan mode to 'Precision', recharging the battery to 100% and extending the range by 50m...");
        finder1.setActive(false);
        finder1.switchScanMode("Precision");
        finder1.rechargeBattery(100);
        finder1.extendRange(50);

        // Display final state
        printBox("Finder 1 Final State", finder1.toString());
        System.out.println();


        System.out.println("=".repeat(80)); //divider line

        // Finder 2

        // Creating an object using the default constructor
        UniversalItemFinder finder2 = new UniversalItemFinder();

        // Display initial state
        System.out.println();
        printBox("Finder 2 Initial State", finder2.toString());
        System.out.println();

        // Modify attributes and behaviors for Finder 2
        System.out.println("--> Setting the finder type to 'Advanced', setting the scan range to 750m and setting the battery to 50%...");
        finder2.setFinderType("Advanced");
        finder2.setScanRange(750);
        finder2.setBatteryLevel(50);

        // Display updated state
        printBox("Finder 2 Updated State", finder2.toString());
        System.out.println();

        // Modify behaviors for Finder 2
        System.out.println("--> Activating the finder, switching it's scan mode to 'Auto' and extending the range by 100m...");
        finder2.activateFinder();
        finder2.switchScanMode("Auto");
        finder2.extendRange(100);

        // Display final state
        printBox("Finder 2 Final State", finder2.toString());
        System.out.println();

    }
}
