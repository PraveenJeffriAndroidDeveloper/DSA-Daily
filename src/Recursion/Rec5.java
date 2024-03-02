package Recursion;

import java.util.Scanner;

public class Rec5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(printSum(n));

    }
    public static int printSum(int n)
    {
        if(n==0) return 0;
        return n + printSum(--n);
    }
}
