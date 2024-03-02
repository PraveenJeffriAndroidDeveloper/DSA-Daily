package PatternProblems;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        char ch  = (char)('A'+n);
        for(int i=0;i<=n;i++)
        {
            char temp = ch;
            for(int j=0;j<=i;j++)
            {
                System.out.print(temp);
                temp++;
            }
            ch--;
            System.out.println();
        }
    }
}
