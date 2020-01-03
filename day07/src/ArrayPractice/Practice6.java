package ArrayPractice;

public class Practice6 {
  public static void main(String[] args) {
	//二分法，线性查找
	  String arr[]= new  String[]{"AA","BB","CC","DD","EE","FF"};
	  String dest = "BB";
	  boolean isFlag = true;
	  for(int i = 0;i<arr.length;i++) {
		  if(dest.contentEquals(arr[i])) {
			  System.out.println("找到了指定的元素，位置为:"+i);
			  isFlag = false;
			  break;
		  }
		 
	  }
	  if(isFlag) {
		  System.out.println("对不起，没有找到");
	  }
	  //二分法查找（有序）
	  int[]arr1 = new int[] {-98,-34,2,34,54,66,79,105,210,333};
	  int dest1 = -34;
	  int head = 0;
	  int end = arr1.length-1;
	  boolean isFlag1 = true;
	  while(head <=end) {
		  int middle = (head+end)/2;
		  if(dest1 ==arr1[middle]) {
			  System.out.println(middle);
			  isFlag1 = false;
			  break;
			  
		  }else if(dest1<arr1[middle]) {
			  end = middle-1;
		  }else {
			  head = middle+1;
		  }
	  }
	  if(isFlag1) {
		  System.out.println("Nothing has been found.");
	  }
	  
}
}
