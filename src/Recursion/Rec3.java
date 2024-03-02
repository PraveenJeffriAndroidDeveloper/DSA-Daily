package Recursion;

import java.util.Scanner;

public class Rec3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printN(1,n);
    }
    public  static  void printN(int count , int n)
    {
        if(count>n) return;
        System.out.println(count);
        printN(++count , n);
    }
}
