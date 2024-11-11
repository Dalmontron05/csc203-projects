//* Main Java File
// Program is a simulation of a university called UAT
// Imports
// import java.util.Scanner;


public class UAT
{
    public static void main(String[] args)
    {
        // Create an object from our SIMManager Class
        SimManager objSimManager = new SimManager();
        // Call the display title method from the SimManager class
        objSimManager.DisplayTitle();
        
        // Create objects
        //  People
        // Person JakeMarrison = new Person("Jake", "Marrison");
        //  Students
        Student RamonLopez = new Student("Ramon", "Lopez", "12345");
        Student AndrewLucier = new Student("Andrew", "Lucier", "54321");
        Student KyleLemons = new Student("Kyle", "Lemons", "67890");
        //  Professors
        Professor LuciferMorningstar = new Professor("Lucifer", "Morningstar");

        // Terminal Output
        AndrewLucier.Talk("I woke up bright and early in my UAT dorm room. After my usual morning routine, I walked to class. On my way to the campus, I see someone.");
        RamonLopez.Talk("Hello! I'm " + RamonLopez.getFirstName() + ". By chance, are you enrolled here?");
        AndrewLucier.Talk("Yes, Why?");
        RamonLopez.Talk("I'm trying to find room 252 for my Java Programming class. Do you know where it is?");
        AndrewLucier.Talk("Yeah I'm just about to go there, come on I'll show you.");
        System.out.println("We made our way to the class.");
        LuciferMorningstar.Teach(KyleLemons, 2);
        LuciferMorningstar.Talk("Welcome, the next class is about to begin!");
        LuciferMorningstar.Teach(RamonLopez, 1, 15);
        LuciferMorningstar.Teach(AndrewLucier, 1, 15);
        KyleLemons.Studying();


        


        // Call exit method
        objSimManager.DisplayExitMessage();
    }
}

