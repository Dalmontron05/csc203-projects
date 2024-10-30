//* Main Java File
// Imports
// import java.util.Scanner;

import java.util.Scanner;

public class CourseChooser
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Prompts the user questions and saves their input
        System.out.print("How fun will the class be (1-10)? ");
        int F = in.nextInt();

        System.out.print("How cool is the Professor (1-10)? ");
        int C = in.nextInt();

        System.out.print("Do I need this class to Graduate (1 = Yes, 2 = No)? ");
        int N = in.nextInt();

        System.out.print("How many hours does this class start after I wake up? ");
        int H = in.nextInt();

        System.out.print("What is the percent chance I will pass this class (e.g., 0.70 for 70%)? ");
        float P = in.nextFloat();

        System.out.print("Is this a repeat, have I taken the class before (1 = No, 2 = Yes)? ");
        int R = in.nextInt();

        System.out.print("Are any of my smart friends taking this class (1 = No, 2 = Yes)? ");
        int S = in.nextInt();

        // Formula to calculate whether someone should take the class
        float x = 0.07f;
        float A = (F + (C / (float) N) + (H * (P / R * S))) * x;
        
        System.out.println(A >= 1 ? "You should take the class" : "You shouldn't take the class.");
        
        in.close();
    }
}

