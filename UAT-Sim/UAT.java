//* Main Java File
// Program is a simulation of a university called UAT
// Imports
import java.util.Scanner;


public class UAT
{
    public static void main(String[] args)
    {
        // Create an object from our SIMManager Class
        SimManager objSimManager = new SimManager();
        // Call the display title method from the SimManager class
        objSimManager.DisplayTitle();
        
        // Create objects
        Student objStudent01 = new Student("Ramon", "Lopez", "12345");
        Student objStudent02 = new Student("Andrew", "Lucier", "54321");
        Student objStudent03 = new Student("Kyle", "Lemons", "67890");

        // Calling move method for each student
        objStudent01.Move("Room 252");
        objStudent02.Move("Room 252");
        objStudent03.Move("Room 252");

        objStudent01.Studying();
        objStudent02.Studying();
        objStudent03.Studying();

        // Call exit method
        objSimManager.DisplayExitMessage();
    }
}

