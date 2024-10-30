//* Main Java File
// Imports
import java.util.Scanner;


public class MarsExpedition
{
    // Variables n shit
    static Scanner in = new Scanner(System.in);
    static boolean willReplay = false;
    
    public static void main(String[] args)
    {

        // Main do loop. lets the user 'replay' the program by setting the bool to true if they answer yes to the replay question.
        do
        {
            System.out.println("Hello World!");
            replay();
        }
        while (willReplay);
    }

    public static void replay()
    {
        // Asks the user if they will replay the program. This lets the program break in the do loop if they answer yes.
        System.out.println("Would you like to replay the program? (true/false)");
        willReplay = in.nextBoolean();
    }
}

