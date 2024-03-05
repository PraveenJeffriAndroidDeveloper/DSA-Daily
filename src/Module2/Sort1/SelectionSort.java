package Module2.Sort1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {13,46,24,52,20,9};

        for(int i=0;i<array.length-1;i++)
        {
            int minimum = i;
            for(int j=i;j<array.length;j++)
            {
                if(array[j]<array[i])
                {
                    minimum = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;

        }

        System.out.println(Arrays.toString(array));
    }
}
