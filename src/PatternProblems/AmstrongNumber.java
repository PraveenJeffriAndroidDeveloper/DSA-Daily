package PatternProblems;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = input.nextInt();
        int numLength = IntegerLength(num);
        int temp = num;
        int result = 0;
        while(temp!=0)
        {
            int rem = temp%10;
            result+=Math.pow(rem,numLength);
            temp/=10;
        }
        System.out.println(result);
        if(result==num)
        {
            System.out.println("Amstrong Number");
        }
        else {
            System.out.println("Not Amstrong Number");
        }
    }
    static int IntegerLength(int number)
    {
        String str = ""+number;
        return str.length();
    }

}
