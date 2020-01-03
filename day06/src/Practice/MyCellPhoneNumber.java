package Practice;

public class MyCellPhoneNumber {
        public static void main(String[] args) {
			int Num[] = new int[] {9,2,0,4,1,8};
			int index[] = new int[] {2,1,2,3,4,0,4,5,2,3,4};
			String cell = "";
			for(int i=0;i<index.length;i++) {
				cell+=Num[index[i]];
			}
			System.out.println("my cell phone number:"+cell);
		}
}
