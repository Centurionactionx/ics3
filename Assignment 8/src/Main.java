import java.io.*;
import java.util.Scanner;

public class Main {
    Scanner s;
    final String line = "---------------------------------------------------------------";

    private interface InputRestriction {
        boolean isValid(String input);
    }

    Main() {
        s = new Scanner(System.in);
        menu();
    }

    public void menu() {
        final String introText = """
                +-------------------------------------------------------------+
                |                          Main Menu                          |
                +----------------------------------------------------+--------+
                | Task                                               | Syntax |
                +----------------------------------------------------+--------+
                | Open an existing course                            | "o"    |
                +----------------------------------------------------+--------+
                | Create a new course                                | "a"    |
                +----------------------------------------------------+--------+
                | Print this table                                   | "h"    |
                +----------------------------------------------------+--------+
                | Find what courses you have saved in your directory | "c"    |
                +----------------------------------------------------+--------+
                | Quit the program                                   | "q"    |
                +----------------------------------------------------+--------+""";

        System.out.println(introText);
        while (true) {
            System.out.print("Please enter your selection: ");

            String userInput = s.nextLine().trim().toLowerCase();
            switch (userInput.toLowerCase()) {
                case "q":
                    System.out.println("Thank you for using our program!");
                    System.exit(0); //end program
                    break;
                case "h":
                    System.out.println(introText);
                    break;
                case "o":
                    System.out.println("\tOpening a course.");
                    courseMenu();
                    break;
                case "c":
                    System.out.println("\tPrinting the courses saved in your directory.");
                    String[] files = listFilesFolder();
                    for (String file : files) {
                        System.out.println(file);
                    }
                    break;

                case "a":
                    System.out.println("\tCreating a new course. ");
                    String courseName = getUserInput("\tPlease enter the name of your new course: ", 1, input -> {
                        try {
                            Integer.parseInt(input);
                            return false;
                        }
                        catch (Exception e) {
                            return !fileExists(input + ".txt");
                        }
                    });

                    boolean successful = createFile(courseName + ".txt");
                    if (successful) {
                        System.out.println("\tSuccessfully created the new course " + courseName + ".");
                    }
                    else {
                        System.out.println("\tError, file cannot be created.");
                    }
                    break;

                default:
                    System.out.print("\tIncorrect input. Try again. ");
                    break;
            }
        }
    }

    public String[] listFilesFolder() {
        //ask mr. g if this is necessairy
        File folder = new File("");
        File[] listOfFiles = folder.listFiles();

        try {
            int cnt = 0;
            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        System.out.println(file.getName());
                        cnt++;
                    }
                }
            }
            String[] out = new String[cnt];
            int i = 0;
            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    System.out.println("IMPORTANT" + file.getName());
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        out[i] = (file.getName());
                        i++;
                    }
                }
            }
            return out;
        }
        catch (Exception e) {
            System.out.println("Could not list files in the folder.");
            return new String[]{"[file name].txt"};
        }
    }

    private boolean createFile(String filename) {
        PrintWriter p; //variable for the file writer object
        try {
            //initialize the printWriter
            p = new PrintWriter (new FileWriter(filename, false)); //override contents
            p.println(0);
            p.close(); //close the file
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    private void courseMenu() {
        String courseName = getUserInput("\tPlease enter the name of your course: ", 2, input -> fileExists(input + ".txt"));
        Course openCourse = new Course(courseName);

        final String introText = """
                \t+-------------------------------------------------------------+
                \t|                         Course Menu                         |
                \t+----------------------------------------------------+--------+
                \t| Task                                               | Syntax |
                \t+----------------------------------------------------+--------+
                \t| Quit this course                                   | "q"    |
                \t+----------------------------------------------------+--------+
                \t| Print the students in your course                  | "p"    |
                \t+----------------------------------------------------+--------+
                \t| Change the grade of a student                      | "c"    |
                \t+----------------------------------------------------+--------+
                \t| View course data                                   | "d"    |
                \t+----------------------------------------------------+--------+
                \t| Add a student to your course                       | "a"    |
                \t+----------------------------------------------------+--------+
                \t| Save your current course configuration to the file | "s"    |
                \t+----------------------------------------------------+--------+
                \t| Print this table                                   | "h"    |
                \t+----------------------------------------------------+--------+""";
        System.out.println(line);
        System.out.printf("You are modifying the %s course.%n", openCourse.getName());
        System.out.println("Bellow are the commands which you can use in the course editor:");
        System.out.println(introText);

        boolean modified = false; //course modified after most recent save
        boolean error = false; //if past input is invalid

        while (true) {
            System.out.print(error ? "\t\tIncorrect input. Try again. " : "\tPlease enter your selection: ");
            String[] userInput = s.nextLine().split(" ");
            switch (userInput[0].toLowerCase()) {
                case "q":
                    if (modified) {
                        String userChoice = getUserInput("\tAre you sure you want to exit the course without saving your progress? (y/n) ",
                                1, input -> input.toLowerCase().charAt(0) == 'y' || input.toLowerCase().charAt(0) == 'n');
                        if (userChoice.equals("y")) {
                            System.out.println("\tExiting the course without saving your progress.");
                            return;
                        }
                    }
                    else {
                        System.out.println("\tClosed the course (all progress saved).");
                        return;
                    }
                    error = false;
                    break;

                case "p":
                    openCourse.printCourse();
                    error = false;
                    break;

                case "c":
                    System.out.println("\tChanging the mark of a student.");
                    if (openCourse.students.length > 0) {
                        int studentIndex = openCourse.studentIndex(getUserInput("\tWhat is the name / number of the student: ",
                                2, input -> openCourse.studentIndex(input) != -1));
                        int grade = Integer.parseInt(getUserInput("\tWhat is the corrected mark of the student: ",
                                2, openCourse::isValidMark));
                        openCourse.updateGrade(studentIndex, grade);
                        modified = true;
                    }
                    else {
                        System.out.println("\tYou have 0 students in this course.");
                    }
                    error = false;
                    break;

                case "d":
                    System.out.println("\tPrinting the data of a course.");
                    openCourse.printData();
                    error = false;
                    break;

                case "a":
                    System.out.println("\tAdding a student to your course.");
                    String newStudentName = getUserInput("\tWhat is the name of the student: ",
                            2, input -> {
                                try {
                                    Integer.parseInt(input);
                                    return false;
                                }
                                catch (NumberFormatException e) {
                                    for (Student s : openCourse.students) {
                                        if (s.getName().equals(input)) {
                                            return false; //name duplication
                                        }
                                    }
                                    return true;
                                }
                            });
                    int newGrade = Integer.parseInt(getUserInput("\tWhat is the current mark of student " + newStudentName + ": ",
                            2, openCourse::isValidMark));
                    openCourse.addStudent(newStudentName, newGrade);
                    System.out.println("\tAdded student " + newStudentName + " to your course.");
                    modified = true;
                    error = false;
                    break;
                case "s":
                    modified = false;
                    openCourse.writeChangesToFile();
                    System.out.println("\tSuccessfully saved your progress.");
                    error = false;
                    break;
                case "h":
                    System.out.println(introText);
                    error = false;
                    break;
                default:
                    System.out.print("\t\tIncorrect input. Try again. ");
                    error = true;
            }
        }
    }

    private String getUserInput(String prompt, int tabs, InputRestriction restriction) {
        /*
         * This method gets input from the user. It keeps requesting input from the user until the input satisfies the
         * input restriction passed in as a parameter. If an invalid input is given, the error text printed is indented
         * by several tabs (the number is determined by the parameter tabs). */
        System.out.print(prompt);
        String input;
        while (true) {
            input = s.nextLine();
            if (restriction.isValid(input)) {
                return input;
            }
            System.out.print("\t".repeat(tabs) + "Invalid input. Please try again: ");
        }
    }

    public boolean fileExists(String path) {
        return new File(path).isFile();
    }

    public static void main(String[] args) {
        new Main();
    }
}