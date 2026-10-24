class Code04_11_1{
	public static int abs(int a) {return a>0?a:-a;}
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a, int b) {return (a>b)?b:a;}
}

public class Code04_11 {

	public static void main(String[] args) {
		System.out.println(Code04_11_1.abs(-5));
		System.out.println(Code04_11_1.max(10, 8));
		System.out.println(Code04_11_1.min(-3, -8));

	}

}
