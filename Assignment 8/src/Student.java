public class Student {
    String name;
    int average;

    Student(String name, int average) {
        this.name = name;
        this.average = average;
    }

    public void setGrade(int grade) {
        average = grade;
    }

    public String getName() {
        return name;
    }

    public int getAverage() {
        return average;
    }
}