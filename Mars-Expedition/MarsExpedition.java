//* Main Java File
// Imports
import java.util.Arrays;
import java.util.Scanner;


public class MarsExpedition
{
    // Variables n shit
    static Scanner in = new Scanner(System.in);
    static boolean willReplay = false;
    
    public static void main(String[] args)
    {
        String[] crewMembers = {"John", "Joe", "Joey", "Joseph", "Jorden", "Jonathan", "Joel", "Jose", "Jonah", "Matt"};
        int[] roomNumbers = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};

        // Main do loop. lets the user 'replay' the program by setting the bool to true if they answer yes to the replay question.
        do
        {
            // Introduction
            System.out.println("Hello Fellow Space Adventurer! This application views the names and room numbers of us mars explorers.\n");
            
            // Prints out crew names and room numbers
            System.out.println("Your Other Crew members: " + Arrays.toString(crewMembers));
            System.out.println("Their Room Numbers: " + Arrays.toString(roomNumbers) + "\n");
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

