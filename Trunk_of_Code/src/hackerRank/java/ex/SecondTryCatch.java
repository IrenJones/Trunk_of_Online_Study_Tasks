package hackerRank.java.ex;

import java.util.Scanner;

public class SecondTryCatch {

	public static void main(String[] args) {
		
		MyCalculator c = new MyCalculator();
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int n = in.nextInt();
			int p = in.nextInt();
			
			try{
				System.out.println(c.power(n, p));
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		
		in.close();

	}

}

class MyCalculator {

	public long power(int n, int p) throws Exception{
		if (n<0 || p<0){
			throw new Exception("n or p should not be negative.");
		}
		else if ( n == 0 && p == 0){
			throw new Exception("n and p should not be zero.");
		}
		return (long) Math.pow(n,p);
	}

    
}
