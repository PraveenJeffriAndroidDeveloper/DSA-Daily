package Module2.Sort1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {13,46,24,52,20,9};

        method2(array);
        for(int i = array.length-1;i>0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(array[j]>array[i])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void method2(int arr[])
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
