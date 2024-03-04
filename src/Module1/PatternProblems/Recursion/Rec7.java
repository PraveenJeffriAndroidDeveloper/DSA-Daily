package Module1.PatternProblems.Recursion;

import java.util.Scanner;

public class Rec7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = factorial(3);
        System.out.println(num);
    }

    public static int factorial(int n)
    {
        if(n==1) return 1;
        return n * factorial(n-1);
    }
}
