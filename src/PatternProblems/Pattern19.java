package PatternProblems;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int starCount = n;
        int spaceCount = 0;

        for(int i=0;i<n;i++)
        {
            //Star
            for(int j=0;j<starCount;j++)
            {
                System.out.print("*");
            }
            //Space
            for(int j=0;j<spaceCount;j++)
            {
                System.out.print("  ");
            }

            //Star
            for(int j=0;j<starCount;j++)
            {
                System.out.print("*");
            }
            spaceCount++;
            starCount--;
            System.out.println();
        }
        spaceCount--;
        starCount++;
        for(int i=0;i<n;i++)
        {
            //start
            for(int j=0;j<starCount;j++)
            {
                System.out.print("*");
            }
            //space
            for(int j=0;j<spaceCount;j++)
            {
                System.out.print("  ");
            }
            //star
            for(int j=0;j<starCount;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            spaceCount--;
            starCount++;
        }
    }
}
