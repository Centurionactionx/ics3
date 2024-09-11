/*
 * Name: Joseph Wang
 * Date: September 10, 2024
 * Course: ICS4UP
 * Description: A program that calculates the payroll of the employees at Sein Co. 
 */

package Assignments;

import java.util.Scanner;

public class Payroll_Calculator {
    // Creates variables for employee names
    String employee1 = "Joshua Cho";
    String employee2 = "Sean Wu";
    String employee3 = "Matthew Park";
    // Creates variables for each employee's rate
    double rate1 = 39.95;
    double rate2 = 35.78;
    double rate3 = 22.34;
    // Creates variables for each employee's hours
    double hours1;
    double hours2;
    double hours3;
    // Creates variables for each employee's total pay
    double monthly_pay1;
    double monthly_pay2;
    double monthly_pay3;

    Scanner s;

    Payroll_Calculator() {
        s = new Scanner(System.in);
    }

    public void getHours() { // Gets the user to input each employee's hours
        System.out.println("Enter the hours for " + employee1);
        hours1 = s.nextDouble();
        System.out.println("Enter the hours for " + employee2);
        hours2 = s.nextDouble();
        System.out.println("Enter the hours for " + employee3);
        hours3 = s.nextDouble();
    }

    public void calculatePay() { // Calculates each employee's total pay
        monthly_pay1 = 4 * rate1 * hours1;
        monthly_pay2 = 4 * rate2 * hours2;
        monthly_pay3 = 4 * rate3 * hours3;
    }

    public void display_headings(){ // Prints out the table's title and headings
        System.out.printf("%70s", "Sein Co.");
        System.out.printf("%n%n%s %20s %25s %20s", "Employee Name", "Hourly Rate", "Total Hours per Week", "Gross Monthly Pay");
    }

    public void display_info() { // Prints out the information in a table
        System.out.printf("%n%-24s %s%.2f %18.1f %18s%.2f", employee1, "$", rate1, hours1, "$", monthly_pay1);
        System.out.printf("%n%-24s %s%.2f %18.1f %18s%.2f", employee2, "$", rate2, hours2, "$", monthly_pay2);
        System.out.printf("%n%-24s %s%.2f %18.1f %18s%.2f", employee3, "$", rate3, hours3, "$", monthly_pay3);
    }

    public static void main(String[] args) {
        Payroll_Calculator p = new Payroll_Calculator();
        p.getHours();
        p.calculatePay();
        p.display_headings();
        p.display_info();
    }
}
