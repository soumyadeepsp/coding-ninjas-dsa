import java.util.*;

// find the start and end points of the longest consequtive subsequence present in an array of random inegers

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], true);
			}
		}
		int start = 0;
		int end = 0;
		int length = 0;
		for (int i=0; i<arr.length; i++) {
			int currStart = arr[i];
			int currEnd = arr[i];
			int currLength = 1;
			while (map.containsKey(currEnd+1)) {
				++currEnd;
				++currLength;
			}
			if (currLength > length) {
				start = currStart;
				end = currEnd;
				length = currLength;
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(start);
		ans.add(end);
		return ans;
    }
}