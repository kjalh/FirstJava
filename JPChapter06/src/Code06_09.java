import java.util.StringTokenizer;
public class Code06_09 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동/장회/홍현/콩쥐/판쥐", "/"); // /로 구분
		while(st.hasMoreTokens()) // 토큰이 있는 동안
			System.out.println(st.nextToken());

	}

}
