package PatternProblems;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        for(int i=n;i>0;i--)
        {
            char ch = 'A';
            for(int j=0;j<i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
