import java.util.Scanner;

/**
 * Write a description of class nting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants. ");
        
        System.out.print("how many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 5) {
            System.out.println("try to squash mkre next time");
        }
        else {
            System.out.println("Good job on helping the earth");
        }
        }
        }

