/**
 * Write a description of class Date here. coding
 *
 * @author (Azizjon Saidjonov)
 * @version (sept 28,2022)
 */
import java.util.Scanner;
public class Date
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the day of the week:  ");
        String day = S.nextLine();
        
        System.out.println("Enter the month: ");
        String month = S.nextLine();
        
        System.out.println("enter the year: ");
        String year = S.nextLine();
        
        System.out.println("Enter the day of the month: ");
        String dayofmonth = S.nextLine();
        
        System.out.println("american format: " + day + ',' + month + ' ' + dayofmonth);
        
        System.out.println("european format: " + day + ' ' + dayofmonth + ' ' + month);
}
}//closes the main method
