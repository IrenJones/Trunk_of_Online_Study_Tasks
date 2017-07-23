package interestingTasksFromInterview;

import java.util.Scanner;


/**
 * 
 * Using comands write(x) only for x=0..9, create recursive programm for printing
 * n (n is an integer positive number)
 *
 */


public class WriteSingle {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		writeRecursive(n);
		in.close();
	}

	private static void writeRecursive(int n) {
		if (n<=9){
			System.out.print(n);
			return;
		}
		writeRecursive(n/10);
		System.out.print(n%10);
	}
}
