package hackerRank.java.datastr;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++){
			int m = in.nextInt();
			ArrayList<Integer> l = new ArrayList<>();
			for(int j=0;j<m;j++){
				l.add(in.nextInt());
			}
			list.add(l);
		}
		
		int nq = in.nextInt();
		for(int i=0;i<nq;i++){
			int x = in.nextInt();
			int y = in.nextInt();
			if (list.size()>x && list.get(x-1).size()>y){
				System.out.println(list.get(x-1).get(y-1));
			}
			else{
				System.out.println("ERROR!");
			}
		}
		
		in.close();

	}

}
