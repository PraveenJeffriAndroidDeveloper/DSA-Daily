package Recursion;

import java.util.Scanner;

public class Rec1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N number to print");
        int n = input.nextInt();
        int count = 0;
        printN(count , n);
    }

    public static  void printN(int count , int n)
    {
        if(count>n) return;
        System.out.println(count++);
        printN(count,n);
    }
}
