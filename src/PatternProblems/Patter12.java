package PatternProblems;

import java.util.Scanner;

public class Patter12 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int matrixSize = n*2;
        int spaceCount = matrixSize-2;
        int count = 1;
        for(int i=0;i<n;i++)
        {
            int num = 1;
            for(int j=0;j<count;j++)
            {
                System.out.print(num);
                num++;
            }
            for(int j=0;j<spaceCount;j++)
            {
                System.out.print(" ");
            }

            num--;
            for(int j=0;j<count;j++)
            {
                System.out.print(num);
                num--;
            }

            spaceCount-=2;
            System.out.println();
            count++;

        }
    }
}
