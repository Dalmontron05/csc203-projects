// Import scanner class to read input from our user
import java.util.Scanner;

// Make sure class name is the same as filename
public class Main
{
    // Main method to run the program
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            // introduction
            System.out.println("Hey man, welcome to the space station! Glad to see you got here safely. I know you're probably excited about being in zero gravity and all, but once you get settled in there's a safety briefing that's been prepared for you just over there. Let us know when you're ready for that.\n");

            // asks for user input
            System.out.println("Oh, sorry I got a little ahead of myself. I'm Luke. You were...?");

            // reads the user input
            String name = in.nextLine();

            // prints user input
            System.out.println("\nWe're happy to have you on board, " + name + "!");

            in.close(); //? why does this not work in a finally block with the try method
        }
    }
}

