import java.util.*;

// you have given an array of random integers. find and print the count of all pais of integers with difference k

public class PairsWithDifferenceK {
	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		int c = 0;
		Set<Integer> keys = map.keySet();
		if (k==0) {
			for (Integer key : keys) {
				if (map.get(key)>1) {
					c = c + key*(key-1)/2;
				}
			}
			return c;
		}
		for (Integer key : keys) {
			if (map.containsKey(k+key)) {
				c = c + map.get(key)*map.get(k+key);
			}
		}
		return c;
	}
}