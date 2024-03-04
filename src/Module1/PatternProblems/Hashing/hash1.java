package Module1.PatternProblems.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {2,2,3,4,4,2};
        Map<Integer , Integer> frequencyMap = new HashMap<>();
        for(int i=0;i< arr.length;i++)
        {
            frequencyMap.put(arr[i] , frequencyMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println("Frequency of elements:");
        for(Map.Entry<Integer , Integer> entry : frequencyMap.entrySet())
        {
            System.out.println(entry.getKey()+"----->"+ entry.getValue());
        }

    }
}
