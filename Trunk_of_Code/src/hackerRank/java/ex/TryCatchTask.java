package hackerRank.java.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTask {

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        try{
	            int x = in.nextInt();
	            int y = in.nextInt();
	            System.out.println(x/y);
	        }
	        catch(ArithmeticException e){
	            System.out.println("java.lang.ArithmeticException: / by zero");
	        }
	        catch(InputMismatchException e){
	            System.out.println("java.util.InputMismatchException");
	        }
	        finally{
	            in.close();
	        }
	    }

}
