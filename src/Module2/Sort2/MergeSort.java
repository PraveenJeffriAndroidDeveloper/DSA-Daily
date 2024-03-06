package Module2.Sort2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        mergeSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[] , int low , int high)
    {
        if(low>=high)return;
        int mid = (low+high)/2;
        mergeSort(arr , low , mid);
        mergeSort(arr , mid+1 , high);
        merge(arr , low , mid , high);
    }

    public static void merge(int arr[] , int low , int mid , int high)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int left = low ;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }

        while(left<=mid)
        {
            list.add(arr[left]);
            left++;
        }

        while(right<=high)
        {
            list.add(arr[right]);
            right++;
        }

        for(int i=low ; i<=high;i++)
        {
            arr[i] = list.get(i-low);
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void mergesort2(int arr[] , int low , int high)
    {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergesort2(arr , low , high);
        mergesort2(arr , mid+1 , high);
        merge2(arr , low , mid , high);

    }

    public static void merge2(int arr[] , int low  , int mid , int high)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int left = low ;
        int right = mid+1;
        while (left <= mid && right<=high)
        {
            if(arr[left]<arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }

        while (left<=mid)
        {
            list.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            list.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            arr[low] = list.get(i-low);
        }
    }





























}
