//* Main Java File
// Imports
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class RAP
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        displayTitle();
        welcomeUser();
        goodbyeUser();
    }

    public static void displayTitle()
    {
        System.out.println("\n\n\t*** Welcome to R.A.P - Room Assignment Program");
    }

    public static void welcomeUser()
    {
        System.out.println("This program will assign emptry rooms to new Mars colonists.");
    }

    public static void goodbyeUser()
    {
        System.out.println("Thank you for using R.A.P!");
    }
}

