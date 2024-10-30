//* Main Java File
// Imports
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class RAP
{
    public static void main(String[] args)
    {
        Random randomAssignment = new Random();
        
        Scanner in = new Scanner(System.in);
        displayTitle();
        welcomeUser();

        String[] rooms = {"Living Quarters 01", "Living Quarters 02", "Living Quarters 03", "Living Quarters 04", "Living Quarters 05", "Living Quarters 06", "Living Quarters 07", "Living Quarters 08", "Living Quarters 09", "Living Quarters 10",};

        String[] colonists = {"Alex", "Daljeet", "Ramon", "Andrew", "Alejandro"};

        String [] assigneedRooms = {"U", "U", "U", "U", "u"};

        System.out.println("Rooms: " + Arrays.toString(rooms));
        System.out.println("Colonists: " + Arrays.toString(colonists));

        int colonistsSize = colonists.length;

        while (assignedRooms[randomRoomsNumber] == "A")
        {
            randomRoomNumber = randomAssignment.nextInt(roomsSize);
        }


        for (int i = 0; i < colonistsSize; i++)
        {
            int roomsSize = rooms.length;
            int randomRoomNumber = randomAssignment.nextInt(roomsSize);
            // generate a random number between 0 and teh size of the rooms array.

            // System.out.println("\nAssigning " + colonists[i] + " to " + rooms[randomAssignment]);

            rooms = Arrays.copyOf(rooms, rooms.length - 1);

            roomsSize = rooms.length;
        }

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

