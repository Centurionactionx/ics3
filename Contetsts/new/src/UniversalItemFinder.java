/*
 * Date: February 19th, 2025
 * Names: Mark Danishevsky and Joseph Wang
 * For: Ms. Krasteva (ICS4UP1 [S2])
 * Title: OOP 2 Original object class and subclass: "Item and Universal Finder"
 * Description: This is the UniversalItemFinder class for a program meant to demonstrate the functionality of our
 *  ItemFinder class (superclass) and our UniversalItemFinder class (extended class). This is the extended class.
 * */

// Subclass: UniversalItemFinder
class UniversalItemFinder extends ItemFinder {
    // Attributes: 5 mutable, 5 immutable
    private String finderType; // Finder type: InHomes, InShops, InWarehouses, Everywhere, Advanced
    private int scanRange; // Scan range in km, set by user
    private boolean isActive; // Is the finder active?
    private String scanMode; // Scan modes: Sweeping, Once
    private int batteryLevel; // Battery level
    private final String MODEL; // Model name
    private final int MAX_RANGE; // Maximum possible scan range in km
    private final String VERSION; // Version number
    private final String PRODUCTION_DATE; // Production date
    private final String MANUFACTURER_CODE; // Manufacturer code

    // Constructors
    public UniversalItemFinder(String itemName, int itemCount, double itemWeight, String location, String itemType,
                               String finderType, int scanRange, boolean isActive, String scanMode, int batteryLevel,
                               String MODEL, int MAX_RANGE, String VERSION, String PRODUCTION_DATE, String MANUFACTURER_CODE,
                               String MANUFACTURER, String SERIAL_NUMBER, String CATEGORY, int WARRANTY_YEARS, String ORIGIN_COUNTRY) {
        super(itemName, itemCount, itemWeight, location, itemType, MANUFACTURER, SERIAL_NUMBER, CATEGORY, WARRANTY_YEARS, ORIGIN_COUNTRY); // Pass itemType to superclass

        // Set attributes
        this.finderType = finderType;
        this.scanRange = scanRange;
        this.isActive = isActive;
        this.scanMode = scanMode;
        this.batteryLevel = batteryLevel;
        // Set constants
        this.MODEL = MODEL;
        this.MAX_RANGE = MAX_RANGE;
        this.VERSION = VERSION;
        this.PRODUCTION_DATE = PRODUCTION_DATE;
        this.MANUFACTURER_CODE = MANUFACTURER_CODE;
    }

    public UniversalItemFinder() {
        super("Unknown", 0, 0.0, "Warehouse A", "Object", "Default-Co", "ABCD-1234", "General", 0, "Unknown"); // Default itemType added

        // Set attributes
        this.finderType = "Standard";
        this.scanRange = 500;
        this.isActive = true;
        this.scanMode = "Manual";
        this.batteryLevel = 100;
        // Set constants
        this.MODEL = "UFX-100";
        this.MAX_RANGE = 1000;
        this.VERSION = "1.0";
        this.PRODUCTION_DATE = "1970-01-01";
        this.MANUFACTURER_CODE = "ABC123";
    }

    // Getters
    public String getFinderType() { // gets the finder type
        return finderType;
    }

    public int getScanRange() { // gets the scan range
        return scanRange;
    }

    public boolean isActive() { // gets the status of the finder
        return isActive;
    }

    public String getScanMode() { // gets the scan mode
        return scanMode;
    }

    public int getBatteryLevel() { // gets the battery level
        return batteryLevel;
    }

    // Setters
    public void setFinderType(String finderType) { // sets the finder type
        this.finderType = finderType;
    }

    public void setScanRange(int scanRange) { // sets the scan range
        this.scanRange = scanRange;
    }

    public void setActive(boolean active) { // sets the status of the finder
        isActive = active;
    }

    public void setScanMode(String scanMode) { // sets the scan mode
        this.scanMode = scanMode;
    }

    public void setBatteryLevel(int batteryLevel) { // sets the battery level
        this.batteryLevel = batteryLevel;
    }

    // Behavior changes
    public void activateFinder() { // activates the finder
        this.isActive = true;
    }

    public void deactivateFinder() { // deactivates the finder
        this.isActive = false;
    }

    public void switchScanMode(String mode) { // switches the scan mode
        this.scanMode = mode;
    }

    public boolean rechargeBattery(int amount) { // recharges the battery
        if (amount < 0) {
            return false; // battery level cannot be negative
        } else {
            this.batteryLevel = Math.min(amount, 100); // battery level cannot exceed 100%
            return true;
        }
    }

    public void extendRange(int extraRange) { // extends the scan range
        this.scanRange += extraRange;
    }

    // toString override
    @Override
    public String toString() {
        return "The Universal Item Finder, model " + MODEL + " (version " + VERSION +
                ", production date: " + PRODUCTION_DATE + ", manufacturer code: " + MANUFACTURER_CODE + "), is a " +
                finderType + " type finder with a scan range of " + scanRange + " (max range: " + MAX_RANGE +
                "), is currently " + (isActive ? "active" : "inactive") + ", uses " + scanMode +
                " scan mode, and has a battery level of " + batteryLevel + "%.";
    }
}