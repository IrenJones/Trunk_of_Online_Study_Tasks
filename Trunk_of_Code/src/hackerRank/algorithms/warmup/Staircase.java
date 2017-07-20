package hackerRank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = n-1;
		for(int i = 0; i<n; i++){
			for (int j = 0;j<n;j++){
				if (j < p){
					System.out.print(" ");
				}
				else{
					System.out.print("#");
				}
			}
			System.out.println();
			p--;
		}
		sc.close();
	}
}
