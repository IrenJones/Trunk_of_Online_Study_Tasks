package hackerRank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int [][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = in.nextInt();
			}
			//in.nextLine();
		}
		System.out.println(findDiff(arr, n));
		in.close();
	}

	private static int findDiff(int[][] arr, int n) {
		int res = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if (j == i){
					res+=arr[i][j];
				}
				if (Math.abs(j+i) == n-1){
					res-=arr[i][j];
				}
			}
		}
		return Math.abs(res);
	}
}
