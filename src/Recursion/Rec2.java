package Recursion;

import java.util.Scanner;

public class Rec2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the N time to print Name");
        int n = input.nextInt();
        int count = 0;
        printName("Jeffri" , n , count);
    }

    public static void printName(String name , int n , int count)
    {
        if(count == n) return;
        System.out.println(name);
        printName(name , n , ++count);
    }
}
