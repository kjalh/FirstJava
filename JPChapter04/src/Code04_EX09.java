
class ArrayUtil01{
	int []result;
	
	public static int [] concat(int[] a, int[] b) {
		//배열 a와 b를 연결한 새로운 배열 리턴
		int[] result = new int[a.length + b.length];
		
		for(int i = 0; i< a.length; i++) {
			result[i] = a[i];
		}
		
		for(int i = 0; i<b.length; i++) {
			result[a.length + i] = b[i];
		}
		
		return result;
	}
	
	public static void print(int[] a) {
		// 배열 a 출력}
		System.out.print("[ ");
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]");
			
	}
}

public class Code04_EX09 {

	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1 , 100, 77};
		int [] array3 = ArrayUtil01.concat(array1, array2);
		ArrayUtil01.print(array3);
		
	}

}
