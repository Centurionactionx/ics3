/*
 * Date: February 19th, 2025
 * Names: Mark Danishevsky and Joseph Wang
 * For: Ms. Krasteva (ICS4UP1 [S2])
 * Title: OOP 2 Original object class and subclass: "Item and Universal Finder"
 * Description: This is the ItemFinder class for a program meant to demonstrate the functionality of our ItemFinder class
 *              (superclass) and our UniversalItemFinder class (extended class). This is the superclass.
 * */

// Superclass: ItemFinder
public class ItemFinder {
    // Attributes: 6 mutable, 5 immutable
    private String itemName;
    private int itemCount;
    private double itemWeight;
    private String location;
    private String itemType;
    private final String MANUFACTURER;
    private final String SERIAL_NUMBER;
    private final String CATEGORY;
    private final int WARRANTY_YEARS;
    private final String ORIGIN_COUNTRY;

    // Constructors
    public ItemFinder(String itemName, int itemCount, double itemWeight, String location, String itemType,
                      String MANUFACTURER, String SERIAL_NUMBER, String CATEGORY, int WARRANTY_YEARS, String ORIGIN_COUNTRY) {
        // Set attributes
        this.itemName = itemName;
        this.itemCount = itemCount;
        this.itemWeight = itemWeight;
        this.location = location;
        this.itemType = itemType;
        // Set constants
        this.MANUFACTURER = "DefaultCo";
        this.SERIAL_NUMBER = "0000-0000";
        this.CATEGORY = "Specific";
        this.WARRANTY_YEARS = 1;
        this.ORIGIN_COUNTRY = "Unknown";
    }

    // Default constructor
    public ItemFinder() {
        // Set attributes
        this.itemName = "Unknown";
        this.itemCount = 0;
        this.itemWeight = 0.0;
        this.location = "Warehouse A";
        this.itemType = "Object";
        // Set constants
        this.MANUFACTURER = "DefaultCo";
        this.SERIAL_NUMBER = "0000-0000";
        this.CATEGORY = "Specific";
        this.WARRANTY_YEARS = 1;
        this.ORIGIN_COUNTRY = "Unknown";
    }

    // Getters
    public String getItemName() { // gets the item name
        return itemName;
    }

    public int getItemCount() { // gets the item count
        return itemCount;
    }

    public double getItemWeight() { // gets the item weight
        return itemWeight;
    }

    public String getLocation() { // gets the location
        return location;
    }

    public String getItemType() { // gets the item type
        return itemType;
    }

    // Setters
    public void setItemName(String itemName) { // sets the item name
        this.itemName = itemName;
    }

    public void setItemCount(int itemCount) { // sets the item count
        this.itemCount = itemCount;
    }

    public void setItemWeight(double itemWeight) { // sets the item weight
        this.itemWeight = itemWeight;
    }

    public void setLocation(String location) { // sets the location
        this.location = location;
    }

    public void setItemType(String itemType) { // sets the item type
        this.itemType = itemType;
    }

    // Behavior changes
    public void increaseItemCount(int amount) { // increases the item count
        this.itemCount += amount;
    }

    public void decreaseItemCount(int amount) { // decreases the item count
        this.itemCount = Math.max(0, this.itemCount - amount);
    }

    public void moveLocation(String newLocation) { // moves the location
        this.location = newLocation;
    }

    public void resetLocation() { // resets the location to the production warehouse
        this.location = "Warehouse A";
    }

    public void updateWeight(double newWeight) { // updates the item weight
        this.itemWeight = newWeight;
    }

    public String toString() {
        return "The " + itemName + " finder, manufactured by " + MANUFACTURER +
                " (serial number: " + SERIAL_NUMBER + "), is a " + CATEGORY + " item finder. It originates from " +
                ORIGIN_COUNTRY + ", has a warranty of " + WARRANTY_YEARS + " years, and is currently located in " +
                location + ". It is used to find " + itemCount + " " + itemType + "(s), each weighing " + itemWeight + " kg.";
    }
}
