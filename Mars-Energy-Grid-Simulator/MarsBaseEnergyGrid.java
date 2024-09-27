//* Main Java File

// Imports
// import java.util.Scanner;

public class MarsBaseEnergyGrid
{
    public static void main(String[] args)
    {
        // Scanner in = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Mars Base Energy Grid Manage!");
        System.out.println("This Program will help you manage the energy grid for the Mars base.");
        System.out.println("I see you are the new commander, let's get started!");

        // Variables
        int[] solarPanels = {30,45,25,35,40};
        int [] windTurbines = {20,30,25,40,35};

        // Adds all values in the two arrays to two variables. then adds the total of both arrays to one variable.
        int totalSolarEnergy = calculateTotalEnergy(solarPanels);
        int totalWindEnergy = calculateTotalEnergy(windTurbines);
        int combinedTotalEnergy = totalSolarEnergy + totalWindEnergy;

        // prints totaled variables
        System.out.println("Total Solar Energy:" + totalSolarEnergy);
        System.out.println("Total Wind Energy:" + totalWindEnergy);
        System.out.println("Total Energy:" + combinedTotalEnergy);
        
        // in.close();
    }

    public static int calculateTotalEnergy(int[] energySources)
    {
        int totalEnergy = 0;

        // loops through the energy sources and add the energy output to the total energy
        // for-each loop: "eachEnergySource" acts as the value for the index, not the index itself.
        for(int eachEnergySource : energySources)
        {
            // add the energy output of the current energy source to the total energy
            // totalEnergy += energySources[eachEnergySource];
            totalEnergy += eachEnergySource;
        }
        return totalEnergy;
    }
}

