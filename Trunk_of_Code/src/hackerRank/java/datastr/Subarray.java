package hackerRank.java.datastr;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a  = new int[n];
		for (int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int count=0;
		//Note it's more easy without subarrays
		for (int i=1;i<=n;i++){
			for(int j=0;j+i<=n;j++){
				//int []subi = new int[i];
				//System.arraycopy(a, j, subi, 0, i);
				int sum = 0;
				for(int k=0;k<i;k++){
					//sum+=subi[k];
					sum+=a[j+k];
				}
				if (sum<0){
					count++;
				}
			}
		}
		System.out.println(count);
		
		sc.close();

	}

}
