
/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        System.out.println(" ");
        input();
    } // end main method
    public static void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 25) {
            System.out.println(" ");
            System.out.println("You can do better than that!");
            System.out.println("Help us stamp out those lil bugs!");
            System.out.println(" ");
            input();
        } // end if statement
        else {
            System.out.println(" ");
            System.out.println("Thanks for doing your part, pats on the back for you");
            System.out.println("Ok now go home");
            System.out.println(" ");
        } // end else statement
        
    }
} // end class
