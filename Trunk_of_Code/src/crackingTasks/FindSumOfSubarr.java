package crackingTasks;

import java.util.Scanner;

public class FindSumOfSubarr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		int n = in.nextInt();
		int m = in.nextInt();
		int locSum = 0;
		
		int []arr = new int [n];
		
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i<n-m;i++){
			for (int j=0;j<m;j++){
				locSum+=arr[i+j];
			}
			System.out.print(locSum + " ");
			locSum = 0;
		}

		in.close();
	}
}
