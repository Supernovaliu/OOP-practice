package ArrayPractice;

public class Practice5 {
   public static void main(String[] args) {
	String arr[]= new  String[]{"AA","BB","CC","DD","EE","FF"};
	String arr1[]=new String[arr.length];
	 for(int i = 0;i<arr.length;i++) {
		 arr1[i]=arr[i];
	 }
//	 for(int i = 0;i<arr.length/2;i++) {
//		 String temp = arr[i];
//		 arr[i]= arr[arr.length-i-1];
//		 arr[arr.length-i-1] = temp;
//	 }
	 for(int i=0,j=arr.length-1;i<j;i++,j--) {
		 String temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
		// System.out.print(arr[i]+"\t");
	 }
	 
		for(int i =0;i<arr.length;i++) {
			 System.out.print(arr[i]+"\t");
		}
	 
}
}
