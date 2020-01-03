package Practice;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		int[][] arr1 = new int[][] {{1,2,3},{4,5},{6,7,8}};
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][2];
		int arr4[][] = {{1,2,3},{4,5,9,10},{6,7,8}};
		for(int i = 0;i<arr4.length;i++) {
			for(int j = 0;j<arr4[i].length;j++) {
				System.out.println(arr4[i][j]+"");
				
			}
			System.out.println();
		}
	}

}
