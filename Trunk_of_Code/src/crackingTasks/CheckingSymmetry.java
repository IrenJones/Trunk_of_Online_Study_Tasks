package crackingTasks;

public class CheckingSymmetry {
	public static boolean checking(int[][] a) {
		if (a == null){
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a.length != a[i].length){
					return false;
				}
				if (i != j && a[i][j] != a[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		int [][] a = new int[][]{
			{1,3,4},
			{3,0,8},
			{4,8,5}
		};
		System.out.println(checking(a));
		System.out.println(checking(new int[][]{
			{1,3,4, 6},
			{3,0,8, 7},
			{4,8,5, 8}
		}));
		System.out.println(checking(null));
	}

}
