import java.util.*;

// given a random integer array, find and print the count of pair of elements in the array which sum upto 0

public class PairSumTo0 {
	public static int PairSum(int[] arr, int size) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		int c = 0;
		while (low<=high) {
			if (arr[low]==0 && arr[high]==0) {
				int temp = high - low + 1;
				c = c + (temp*(temp-1))/2;
				break;
			}
			if (arr[low]+arr[high]==0) {
				int x = 1;
				int y = 1;
				for (int i=low+1; i<high; i++) {
					if (arr[i]==arr[low]) {
						++x;
					} else {
						break;
					}
				}
				for (int i=high-1; i>low; i--) {
					if (arr[i]==arr[high]) {
						++y;
					} else {
						break;
					}
				}
				c = c + x*y;
				low = low + x;
				high = high - y;
			} else if (arr[low]+arr[high]>0) {
				--high;
			} else {
				++low;
			}
		}
		return c;
	}
}