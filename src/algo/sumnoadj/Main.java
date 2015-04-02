package algo.sumnoadj;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 7, 10 };
		System.out.println(maxSumNoAdjacent(arr));
	}

	// http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
	private static int maxSumNoAdjacent(int[] arr) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < arr.length; i++) {
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;

			/* current max including i */
			incl = excl + arr[i];
			excl = excl_new;
		}

		/* return max of incl and excl */
		return ((incl > excl) ? incl : excl);
	}

}
