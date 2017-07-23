package crackingTasks;

import java.util.Scanner;

/**
 * 
 * Numbers n, m, a[n]  are given. For each subarray of length = m (all elements are situated one next other)
 * calculate sum of that elements. All number of actions should be O(n).
 *
 */


public class FindSumOfSubarr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		int n = in.nextInt();
		int m = in.nextInt();
		int locSum = 0;
		
		int []a = new int [n];
		
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		
		for(int i = 0; i<n-m;i++){
			for (int j=0;j<m;j++){
				locSum+=a[i+j];
			}
			System.out.print(locSum + " ");
			locSum = 0;
		}

		in.close();
	}
}
