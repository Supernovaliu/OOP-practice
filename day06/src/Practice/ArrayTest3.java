package Practice;
//二维数组分为外层数组的元素，内层数组的元素
//外层元素的初始化值为：地址值
//内层元素初始化值与一维数组相同
//数组名称默认存储地址
public class ArrayTest3 {
	public static void main(String[] args) {
		int[][]arr = new int[4][3];
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr);
		
		String[][]arr3 = new String[4][];
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
