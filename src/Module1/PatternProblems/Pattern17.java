package Module1.PatternProblems;
import java.util.Scanner;

public class Pattern17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int spaceCount = n-1;
        int charCount = 1;
        for(int i=0;i<n;i++)
        {
            char ch = 'A';
            //space
            for(int j =1;j<=spaceCount;j++)
            {
                System.out.print("_");
            }
            //char
            for(int j=0;j<charCount;j++)
            {
                if(j>=i)
                {
                    System.out.print(ch);
                    ch--;
                }
                else {
                    System.out.print(ch);
                    ch++;
                }
            }
            //space
            for(int j =1;j<=spaceCount;j++)
            {
                System.out.print("_");
            }

            spaceCount--;
            charCount+=2;
            System.out.println();
        }
    }
}
