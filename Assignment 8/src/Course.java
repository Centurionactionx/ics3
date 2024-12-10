/**/

import java.io.*;
import java.util.Scanner;

public class Course {
    Student[] students;
    String name;
    String path;

    Course(String name) {
        this.name = name;
        this.path = name + ".txt";
        readFile();
    }

    public void writeChangesToFile() {
        PrintWriter p; //variable for the file writer object

        try {
            //initialize the printWriter
            p = new PrintWriter (new FileWriter(path, false)); //override contents
            p.println(students.length); //write the data to the file
            for (Student student : students) {
                p.println(student.getName() + "," + student.getAverage());
            }
            p.close(); //close the file and save the data
        }
        catch (Exception e){
            System.out.println("Error, file cannot be created or found");
        }

    }

    public boolean isValidMark(String mark) {
        try {
            return 0 <= Integer.parseInt(mark) && Integer.parseInt(mark) <= 100;
        }
        catch (Exception e) {
            return false;
        }
    }

    public int studentIndex(String student) {
        try {
            int studentIndex = Integer.parseInt(student);
            return studentIndex - 1;
        }
        catch (Exception e) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getName().equalsIgnoreCase(student)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void addStudent(String studentName, int studentMark) {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = new Student(studentName, studentMark);
        students = newStudents;
    }

    public void updateGrade(int studentIndex, int mark) {
        students[studentIndex].setGrade(mark);
    }

    public String getName() {
        return name;
    }

    public void printData() {
        String template = """
                +---------------------------------------------+
                |%s|
                +---------+---------+---------+---------------+
                | Mean    | Range   | Passing | Std Deviation |
                +---------+---------+---------+---------------+
                |%s|%s|%s|%s|
                +---------+---------+---------+---------------+%n""";
        System.out.printf(template,
                paddedString(name,45),
                paddedString(Float.toString((float) Math.round(courseMean() * 100) / 100) + "%",9),
                paddedString(Float.toString((float) Math.round(courseRange() * 100) / 100) + "%",9),
                paddedString(Float.toString((float) Math.round(coursePassing() * 100) / 100) + "%",9),
                paddedString(Float.toString((float) Math.round(courseStdDeviation() * 100) / 100) + "%",15));

    }

    private int gradesSum() {
        int sum = 0;
        for (Student student : students) {
            sum += student.getAverage();
        }
        return sum;
    }

    private float courseVariance() {
        float mean = courseMean();
        float variance = 0;
        for (Student student : students) {
            variance += (float) Math.pow(student.getAverage() - mean, 2);
        }
        System.out.println("Squared sum "  + variance);
        variance = variance / (students.length - 1);
        return variance;
    }

    private float courseStdDeviation() {
        float variance = courseVariance();
        return (float) Math.sqrt(variance);
    }

    private float coursePassing() {
        int pass = 0;
        for (Student student : students) {
            if (student.getAverage() >= 50) {
                pass += 1;
            }
        }
        return (float) pass / students.length * 100;
    }

    private float courseMean() {
        int sum = gradesSum();
        return students.length > 0 ? (float) sum / students.length : 0;
    }

    private float courseRange() {
        if (students.length > 0) {
            int minV = students[0].getAverage();
            int maxV = students[0].getAverage();
            for (Student student : students) {
                if (student.getAverage() < minV) {
                    minV = student.getAverage();
                }
                if (student.getAverage() > maxV) {
                    maxV = student.getAverage();
                }
            }
            return maxV - minV;
        }
        else {
            return 0;
        }
    }

    public void printCourse() {
        String title = """
                \t+----------------------------------------------+
                \t|%s|
                """;
        System.out.printf(title, paddedString(name, 46));
        String header = """
                \t+----------------------------+-----------------+
                \t| Student Name               | Overall Average |
                \t+----------------------------+-----------------+""";
        System.out.println(header);
        if (students.length > 0) {
            for (Student student : students) {
                System.out.printf("\t|%s|%s|%n\t+----------------------------+-----------------+%n",
                        paddedString(student.getName(), 28),
                        paddedString(Integer.toString(student.getAverage()), 17));
            }
        }
        else {
            System.out.println("          [No students in this class]");
        }
    }

    private String paddedString(String content, int spaceToFill) {
        /*
         * Returns the string padded with spaces left and right to make the combined string spaceToFill characters wide.
         * */
        if (content.length() > spaceToFill) {
            //if the content given is too long, we trim it
            return content.substring(0, spaceToFill);
        }
        else {
            return (leftPadding(spaceToFill, content.length())) + content + rightPadding(spaceToFill, content.length());
        }
    }

    private String rightPadding (int spaceToFill, int fieldLength) {
        /* This function outputs the left padding (of spaces) inside the table next to the field variable.
           If the total sum of left and right padding is odd, then the left padding will be one character bigger.
        */
        return (" ".repeat((int) Math.floor((spaceToFill - fieldLength) / 2.0)));
    }

    private String leftPadding (int spaceToFill, int fieldLength) {
        /* This function outputs the right padding inside the table next to the field variable. */
        return (" ".repeat((int) Math.ceil((spaceToFill - fieldLength) / 2.0)));
    }

    private void readFile() {
        try {
            //open the file
            File f = new File (path);
            Scanner markFile = new Scanner (f);
            int n = Integer.parseInt(markFile.nextLine());

            students = new Student[n];
            for (int i = 0; i < n; i++) {
                String[] line = markFile.nextLine().split(",");
                students[i] = new Student(line[0], Integer.parseInt(line[1]));
            }
        }
        catch (Exception e) {
            System.out.println ("File in incorrect format");
        }
    }
}