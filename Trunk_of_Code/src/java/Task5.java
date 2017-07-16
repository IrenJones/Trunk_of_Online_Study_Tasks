package java;

import java.util.Scanner;

public class Task5 {

	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                int space_count = s1.length();
	                System.out.printf("%-15s%03d\n", s1,x);
	            }
	            System.out.println("================================");

	    }
}
