import java.util.Arrays;

public class Code09_10 {

	public static void main(String[] args) {
		String[] oldAry = {"짜장", "탕수육", "군만두"};
		String[] newAry;
		
		newAry = oldAry;
		
		oldAry[0] = "쟁반짜장";
		newAry[1] = "짬뽕";
		
		System.out.println("원본 배열 : " + Arrays.toString(oldAry));
		System.out.println("복사 배열 : " + Arrays.toString(newAry));

	}

}
