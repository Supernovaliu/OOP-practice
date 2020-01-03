package ArrayPractice;
//(int)(Math.random()*90+10)[10,99]
//求最大值，最小值，总和，平均数
public class Practice3 {
    public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i =0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*90+10);
			System.out.print(arr[i]+"\t");
			
		}
		System.out.println();
		int maxValue = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println("max value is:"+maxValue);
		int minValue = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(minValue>arr[i]) {
				minValue = arr[i];
			}
			
		}
		System.out.println("min value is:"+minValue);
		int sum  = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum is:"+sum);
		int average = sum/arr.length;
		System.out.println("average is:"+average);
	}
}
