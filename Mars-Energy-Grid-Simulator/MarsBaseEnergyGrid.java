//* Main Java File

// Imports
import java.util.Scanner;

public class MarsBaseEnergyGrid
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Mars Base Energy Grid Manage!");
        System.out.println("This Program will help you manage the energy grid for the Mars base.");
        System.out.println("I see you are the new commander, let's get started!");

        int[] solarPanels = {30,45,25,35,40};
        int [] windTurbines = {20,30,25,40,35};

        int totalSolarEnergy = calculateTotalEnergy(solarPanels);
        int totalWindEnergy = calculateTotalEnergy(windTurbines);
        int combinedTotalEnergy = totalSolarEnergy + totalWindEnergy;

        System.out.println("total solar energy:" + totalSolarEnergy);
        System.out.println("total wind energy:" + totalWindEnergy);
        System.out.println("total energy:" + combinedTotalEnergy);
        
        in.close();
    }

    public static int calculateTotalEnergy(int[] energySources)
    {
        int totalEnergy = 0;

        // loops through the energy sources and add the energy output to the total energy
        for(int eachEnergySource : energySources)
        {
            // add the energy output of the current energy source to the total energy
            // totalEnergy += energySources[eachEnergySource];
            totalEnergy += eachEnergySource;
        }
        return totalEnergy;
    }
}

