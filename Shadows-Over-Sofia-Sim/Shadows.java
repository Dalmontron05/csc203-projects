//* Main Java File

// Imports
import java.util.Scanner;


public class Shadows
{
    public static void main(String[] args)
    {
        displayTitle();
        displayDescription();
    }

    public static void displayTitle()
    {
        System.out.println("\n\n\t *** Shadows Over Sofia Crime Sim *** \n\n");
    }

    public static void displayDescription()
    {
        System.out.println("\na cool description");
    }

    // Senario 1: The Unsettling Telegram
    public static int Senario1()
    {
        // Introduction
        System.out.println("\n***The Unsettling Telegram***\n");
        
        // Choices
        System.out.println("1. Choice 1");
        
        System.out.println("2. Choice 2");
        
        System.out.println("3. Choice 3");
        
        Scanner in = new Scanner(System.in);
        int answer;
        answer = in.nextInt();
        in.close();

        switch (answer)
        {
            case 1:
                System.out.println("Stuff after you made choice 1...");
                break;
            case 2:
                System.out.println("Stuff after you made choice 2...");
                break;
            case 3:
                System.out.println("Stuff after you made choice 3...");
                break;
            default:
                System.err.println("Invalid choice");
        }

        return answer;
    }
}

