import java.util.*;

// you are given an array of integers in random order.
// WAP to find and return the number which occurs the maximum number of times.

public class MaximumFrequencyNumber {
    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int currentFreq = map.get(arr[i]);
				map.put(arr[i], currentFreq+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int maxElement = Integer.MIN_VALUE;
		int maxCount = Integer.MIN_VALUE;
		for (int i=0; i<arr.length; i++) {
			int key = arr[i];
			if (map.get(key)>maxCount) {
				maxCount = map.get(key);
				maxElement = key;
			}
		}
		return maxElement;
    }
}