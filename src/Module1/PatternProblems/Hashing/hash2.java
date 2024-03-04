package Module1.PatternProblems.Hashing;

import java.util.HashMap;
import java.util.Map;

public class hash2 {
    public static void main(String[] args) {
        int inputArray[] = {10,5,10,15,10,5};
        Map<Integer , Integer> frequencyMap = new HashMap<>();
        for(int i=0;i<inputArray.length;i++)
        {
            frequencyMap.put(inputArray[i] , frequencyMap.getOrDefault(inputArray[i] , 0)+1);
        }

        int maxFrequencyValue = 0;
        int maxFrequencyKey = 0;
        for(Map.Entry<Integer , Integer> entry : frequencyMap.entrySet())
        {
            if(entry.getValue()>maxFrequencyValue)
            {
                maxFrequencyValue = entry.getValue();;
                maxFrequencyKey = entry.getKey();
            }
        }
        System.out.println("Max Frequency Value is = "+maxFrequencyKey);
        int minFrequencyValue = Integer.MAX_VALUE;
        int minFrequencyKey = Integer.MAX_VALUE;
        for(Map.Entry<Integer , Integer> entry : frequencyMap.entrySet())
        {
            if(entry.getValue()<minFrequencyValue)
            {
                minFrequencyValue = entry.getValue();;
                minFrequencyKey = entry.getKey();
            }
        }
        System.out.println("Min Frequency Value is = "+minFrequencyKey);
    }
}
