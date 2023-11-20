import java.util.*;

// you have been given 2 integer arrays of sizes N and M respectively. print their intersection.
// intersection means the common values which are present in both the arrays

public class PrintIntersection {
	public static void intersection(int[] arr1, int[] arr2) {
		int p1 = 0;
		int p2 = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while (p1<arr1.length && p2<arr2.length) {
			if (arr1[p1]==arr2[p2]) {
				System.out.print(arr1[p1]+" ");
				++p1;
				++p2;
			} else if (arr1[p1]>arr2[p2]) {
				++p2;
			} else {
				++p1;
			}
		}
	}
}