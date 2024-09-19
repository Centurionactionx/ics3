/*
 * Name: Joseph Wang
 * Date: September 19 2024
 * Description: A program that prints a table of patterns
 */

package Assignments;

public class Table {

    Table() {
    }

    public void display_title() { // displays the title of the table
        System.out.printf("%35s", "Table of Patterns");
    }

    public void display_table() { // displays the table of patterns with 6 columns
        System.out.printf("");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%n%-10d%-10d%-10d%-10d%-10d%-10d", i, i + 2, i * 12, -1 * i - 3, 31 - i, i + 8);
        }
    }

    public static void main(String[] args) {
        Table t = new Table();
        t.display_title();
        t.display_table();
    }
}
