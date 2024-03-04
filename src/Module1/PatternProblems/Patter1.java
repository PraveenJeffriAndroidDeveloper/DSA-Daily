package Module1.PatternProblems;
import java.util.*;
public class Patter1 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();

        int rightSideCount = 0;
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            int count = 0;
            while(count<rightSideCount)
            {
                System.out.print("*");
                count++;
            }
            rightSideCount++;
            System.out.println();

        }

        int starCount = 2*n-1;
        int spaceCount = 0;

        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<spaceCount;j++)
            {
                System.out.print("_");
            }

            //star
            for (int j=0;j<starCount;j++)
            {
                System.out.print("*");
            }

            //space
            for(int j=0;j<spaceCount;j++)
            {
                System.out.print("_");
            }
            starCount-=2;
            spaceCount++;
            System.out.println();

        }
    }
}
