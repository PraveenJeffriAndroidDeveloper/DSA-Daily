package PatternProblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the Number : ");
            int number = input.nextInt();
            int m = number/2;
            int flag = 0;
            if(number==0 || number==1)
            {
                System.out.println(number+" is a prime number");
            }
            else {
                for(int i=2;i<=m;i++)
                {
                    if(number%i==0)
                    {
                        System.out.println(number+" is not a prime number");
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag==0)
            {
                System.out.println(number+" is a prime number");
            }
        }
    }
}
