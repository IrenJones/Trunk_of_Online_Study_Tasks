package hackerRank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p_count = 0;
		int ng_count = 0;
		int nt_count = 0;
		int element;
		for(int i=0;i<n;i++){
			element = sc.nextInt();
			if (element >0){
				p_count++;
			}
			else if (element == 0){
				nt_count++;
			}
			else{
				ng_count++;
			}
		}
		System.out.println(p_count/(double)n);
		System.out.println(ng_count/(double)n);
		System.out.println(nt_count/(double)n);
		sc.close();
	}
}
