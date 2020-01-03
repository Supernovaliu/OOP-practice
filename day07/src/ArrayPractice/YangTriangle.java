package ArrayPractice;
//print yang's triangle
public class YangTriangle {
       public static void main(String[] args) {
		int[][]yangTriangle = new int [10][10];
		
		for(int i =0;i<yangTriangle.length;i++) {
			System.out.println();
			for(int j =0;j<yangTriangle[i].length;j++) {
				if(j==0||j ==i) {
					yangTriangle[i][j]=1;
					
				}else if(j<i) {
					yangTriangle[i][j] = yangTriangle[i-1][j-1]+yangTriangle[i-1][j];
					
				}else {
					yangTriangle[i][j] = 0;
				}
				System.out.print(yangTriangle[i][j]+"\t");
			}
			
		}
		
	}
}
