/*
 * Name: Joseph Wang
 * Date: 
 */

package Assignments;

import java.util.Scanner;

public class Payroll_Calculator {

    String employee1 = "Joshua Cho";
    String employee2 = "Sean Wu";
    String employee3 = "Matthew Park";

    double rate1 = 39.95;
    double rate2 = 35.78;
    double rate3 = 22.34;

    double hours1;
    double hours2;
    double hours3;

    double monthly_pay1;
    double monthly_pay2;
    double monthly_pay3;

    Scanner s;

    Payroll_Calculator() {
        s = new Scanner(System.in);
    }

    public void getHours() {
        System.out.println("Enter the hours for " + employee1);
        hours1 = s.nextDouble();
        System.out.println("Enter the hours for " + employee2);
        hours2 = s.nextDouble();
        System.out.println("Enter the hours for " + employee3);
        hours3 = s.nextDouble();
    }

    public void calculatePay() {
        monthly_pay1 = 4 * rate1 * hours1;
        monthly_pay2 = 4 * rate2 * hours2;
        monthly_pay3 = 4 * rate3 * hours3;
    }

    public void display() {
        System.out.printf("%70s", "Sein");
        System.out.printf("%n%n%s %20s %25s %20s", "Employee Name", "Hourly Rate", "Total Hours per Week", "Gross Monthly Pay");
        System.out.printf("%n%12s %16s%.2f %18.1f %18s%.2f", employee1, "$", rate1, hours1, "$", monthly_pay1);
        System.out.printf("%n%12s %16s%.2f %18.1f %18s%.2f", employee2, "$", rate2, hours2, "$", monthly_pay2);
        System.out.printf("%n%12s %16s%.2f %18.1f %18s%.2f", employee3, "$", rate3, hours3, "$", monthly_pay3);
    }

    public static void main(String[] args) {
        Payroll_Calculator p = new Payroll_Calculator();
        p.getHours();
        p.calculatePay();
        p.display();
    }
}
