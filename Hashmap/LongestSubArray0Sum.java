import java.util.*;

// given an array of +ve and -ve integers, find the longest subarray whose sum is 0

public class LongestSubArray0Sum {
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		int s = 0;
		ArrayList<Integer> t = new ArrayList<>();
		t.add(-1);
		map.put(0, t);
		for (int i=0; i<arr.length; i++) {
			s = s + arr[i];
			if (map.containsKey(s)) {
				map.get(s).add(i);
			} else {
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(i);
				map.put(s, temp);
			}
		}
		int max = Integer.MIN_VALUE;
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			ArrayList<Integer> temp = map.get(key);
			int l = temp.get(temp.size()-1) - temp.get(0);
			if (l>max) {
				max = l;
			}
		}
		return max;
	}
}