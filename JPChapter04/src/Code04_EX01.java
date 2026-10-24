
public class Code04_EX01 {
	static class TV{
		String name;
		int year;
		int inches;
		
		public TV(String n, int y, int i) {
			name = n;
			year = y;
			inches = i;
		}
		public void show() {
			System.out.print(name + "에서 만든 " + year + "년형 " + inches + " TV");
		}
	}

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
