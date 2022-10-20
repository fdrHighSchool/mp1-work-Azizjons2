
/**
 * Write a description of class username here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Are you a student or a teacher:");
    String email = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Whats you favorate number: ");
    String number = s.nextLine();
        

    // test output
    if(email.equals("student")) {
        System.out.println("Hello " + (firstName) + initialize(lastName) + (number) + ("@nycstudents.net"));
    }
    else {
        System.out.println("Hello "  + initialize(firstName) + (lastName) + (number) + ("@schools.nyc.gov"));
    }
    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
    
    
  } // end initialize method  
}// end class




