package java_course.intro;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<11;i++){
			System.out.println(n + " x " + i +" = " + n*i);
		}
		sc.close();
	}
}