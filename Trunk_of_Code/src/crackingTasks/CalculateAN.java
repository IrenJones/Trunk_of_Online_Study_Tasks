package crackingTasks;

import java.util.Scanner;

/**
 * 
 * Int a and int n are given. Calculate an.
 * Note: a and n shouldn't change. That means that result value should be saved in another int b (or not :D). 
 *
 */


public class CalculateAN {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int n = in.nextInt();
		System.out.println(a*n);;
		
		in.close();
	}
}
