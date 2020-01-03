package ArrayPractice;

public class YangTriangle2 {
	public static void main(String[] args) {
		int yangTriangle[][] = new int[10][];
		for(int i = 0;i<yangTriangle.length;i++) {
			System.out.println();
			yangTriangle[i] = new int[i+1];
			  for(int j = 0;j<yangTriangle[i].length;j++) {
				  
				  if(j==0||j==i) {
					  yangTriangle[i][j] = 1;
				  }else {
					  yangTriangle[i][j] = yangTriangle[i-1][j-1]+yangTriangle[i-1][j];
				  }
				  System.out.print(yangTriangle[i][j]+" ");
			  }
		}
		
	}

}
