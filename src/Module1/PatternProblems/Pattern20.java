package Module1.PatternProblems;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int starCount = 1;
        int spaceCount = n-1;
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
            starCount++;
            spaceCount--;
            System.out.println();
        }
        starCount-=2;
        spaceCount+=2;
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
            starCount--;
            spaceCount++;
            System.out.println();
        }
    }
}
