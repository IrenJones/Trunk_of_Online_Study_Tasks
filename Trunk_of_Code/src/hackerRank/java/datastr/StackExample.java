package hackerRank.java.datastr;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {

	   public static void main(String []argh)
	   {
	      Scanner sc = new Scanner(System.in);
	      Stack<Character> stack = new Stack<>();
	       
	      while (sc.hasNext()) {
	         String input=sc.next();
	         char [] s = input.toCharArray();
	        
	         int i = 0;
	         while(i<s.length){
	        	 if (!stack.isEmpty()){
	        		 if (stack.peek() == '[' && s[i] == ']' || 
	        				 stack.peek() == '(' && s[i] == ')' ||
	        				 stack.peek() == '{' && s[i] == '}'){
	        			 stack.pop();
	        		 }
	        		 else{
	        			 stack.push(s[i]);
	        		 }
	        	 }
	        	 else{
	        		 stack.push(s[i]);
	        	 }
	        	 i++;
	         }
	         
	         if (stack.isEmpty()){
	        	 System.out.println("true");
	         }
	         else{
	        	 System.out.println("false");
	        	 stack.clear();
	         }
	      }
	      sc.close();
	      
	   }

}
