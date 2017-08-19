package crackingTasks;

import java.util.Scanner;

public class Ulitochka {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int MAXI = n*m;
		int curr = 1;
		
		int w = 0;
		int h = 0;
		
		int arr[][]= new int[n][m];
		
		big: while(curr <=MAXI){
			for (int j = 0+w;j<m-w;j++){
				arr[h][j] = curr++;
				if (curr > MAXI) {
					continue big;
				}
			}
			for (int i = 1+h;i<n-h;i++){
				arr[i][m-1-w] = curr++;
				if (curr > MAXI) {
					continue big;
				}
			}
			
			w++;
			
			for (int j = m-w-1;j>= w-1;j--){
				arr[n-1-h][j] = curr++;
				if (curr > MAXI) {
					continue big;
				}
			}
			h++;
			
			for (int i = n-h-1;i> h-1;i--){
				arr[i][w-1] = curr++;
				if (curr > MAXI) {
					continue big;
				}
			}
		}
		
		for (int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		in.close();
	}

}
