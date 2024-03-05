package Module2.Sort1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {13,46,24,52,20,9};
        for(int i=0;i<array.length;i++)
        {
            int j=i;
            while(j>0 && array[j-1]>array[j])
            {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
