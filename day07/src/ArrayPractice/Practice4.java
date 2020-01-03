package ArrayPractice;

public class Practice4 {
	public static void main(String[] args) {
    int[] arr1,arr2;
    arr1 = new int[] {2,3,5,7,11,13,17,19};
    for(int i = 0;i<arr1.length;i++) {
    	System.out.print(arr1[i]+"\t");
    }
    System.out.println();
    arr2 = arr1;//不能称作数组的赋值，只是地址的赋值
    //修改arr2中的偶索引元素，使其等于索引值，如arr[0] = 0,arr[2] = 2
    for(int j = 0;j<arr2.length;j++) {
    	if(j%2==0) {
    		arr2[j] = j;
    	}
    }
    for(int i = 0;i<arr1.length;i++) {
    	System.out.print(arr1[i]+"\t");
    }
	}

}
