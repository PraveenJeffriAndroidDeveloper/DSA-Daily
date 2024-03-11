package Module3.Easy;

public class Array2 {
    public static void main(String[] args) {
        int arr[] = {8, 8, 8, 8, 9, 9, 9, 9};
        int max1 = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max1 = arr[i];
            }
        }
        int max2 = arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>max2 && arr[i]<max1)
           {
               max2 = arr[i];
           }
        }
        System.out.println(max2);
    }
}
