// Import scanner class to read input from our user
import java.util.Scanner;

// Make sure class name is the same as filename
public class Main
{
    // Main method to run the program
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            // asks for user input
            System.out.println("What's your name?");
            // reads the user input
            String name = in.nextLine();
            // prints user input
            System.out.println("We're happy to have you on board, " + name + "!");
            in.close();
        }
    }
}

