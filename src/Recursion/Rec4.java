package Recursion;

import java.util.Scanner;

public class Rec4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printReverse(n);
    }

    public static void printReverse(int n)
    {
        try {
            if(n==0) return;
            System.out.println(n--);
            printReverse(n);
        }
        catch (StackOverflowError e)
        {
            System.out.println(e.toString());
        }

    }
}
