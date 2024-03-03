package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Rec6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = arr.length-1;
        System.out.println(Arrays.toString(arr));
        reverseArray(arr , left , right);
        //reverseArray();
    }

    public static void reverseArray(int[] arr , int left , int right)
    {
        if(left>=right) return;
        reverseArray(arr , left+1 , right-1);
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray()
    {
        int[] arr = {1,2,3,4,5};
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            System.out.println(Arrays.toString(arr));
        }
    }
}
