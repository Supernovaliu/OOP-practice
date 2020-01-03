package DsAndAlgrithm;

public class Practice {
     public static void main(String[] args) {
		//创建一个原始的二维数组
    	 //0表示没有棋子，1表示黑子，2表示蓝子
    	 int[][] chess = new  int[11][11];
    	 chess[1][2] = 1;
    	 chess[2][4] = 2;
    	 //输出原始的二维数组
    	 System.out.println("原始的二维数组");
    	 for(int[]row:chess) {
    		 for(int data:row) {
    			 System.out.printf("%d\t",data);
    			 
    		 }
    		 System.out.println();
    	 }
    		 //先遍历二维数组得到非零数据的个数
    	 int sum = 0;
    	 for (int i = 0;i<11;i++) {
    		 for(int j = 0;j<11;j++) {
    			 if(chess[i][j]!=0) {
    				 sum++;
    			 }
    			 
    		 }
    	 }
    	 int sparsearray[][] = new int[sum+1][3];
    	 //给稀疏数组赋值
    	 sparsearray[0][0] = 11;
    	 sparsearray[0][1] = 11;
    	 sparsearray[0][2] = sum;
    	 //遍历二维数组，将非零的值存放到稀疏数组中
    	 int count = 0;
    	 for(int i =0;i<11;i++) {
    		 for(int j = 0;j<11;j++) {
    			 if (chess[i][j]!=0) {
    				 count++;
    				 sparsearray[count][0] = i;
    				 sparsearray[count][1] = j;
    				 sparsearray[count][2] = chess[i][j];
    			 }
    			 
    		 }
    	 }
    	 System.out.println();
    	 System.out.println("得到稀疏数组为");
    	 for(int i = 0;i<sparsearray.length;i++) {
    		 System.out.printf("%d\t%d\t%d\t\n",sparsearray[i][0],sparsearray[i][1],sparsearray[i][2]);
    	 }
    	 System.out.println();
    	 int chessarr[][]= new int [sparsearray[0][0]][sparsearray[0][1]];
    	 for(int i = 1;i<sparsearray.length;i++) {
    		 chessarr[sparsearray[i][0]][sparsearray[i][1]] = sparsearray[i][2];
    	 }
    	 System.out.println();
    	 for(int[]row:chessarr) {
    		for(int data:row) {
    			System.out.printf("%d\t",data);
    			
    		}
    		System.out.println();
    	 }
	}
}
