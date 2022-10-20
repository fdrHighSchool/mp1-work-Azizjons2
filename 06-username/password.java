
/**
 * Write a description of class password here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class password
{
public static String generatepassword(int length) {
        String password = "";
        
        for(int i = 0; i < length; i++) {
        
        generatepassword(8);
        //generate a random number
        int rand = (int)(Math.random()*(90-65+1)+65);
        
        char c = (char)rand; 
        System.out.println(rand + " " + c);
        String capitalcaseletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseletters = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "1234567890";
        System.out.println((capitalcaseletters) + (lowercaseletters) + (Numbers));
        //65-90 capital letters
        //97-122 lowercase 
        //33 - 47 secial symbols
        
        }
        return password;
    }
}//end classs