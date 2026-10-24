package practice;

public class 파트1거북이별 {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		int i, j;
//		for(j=0; j<2; j++) {
//			for(i=0;i<5;i++) {
//				t.forward(100);
//				t.right(144);
//			}
//			t.right(144);
//		}
		
		for(i=0;i<5;i++) {
			t.forward(100);
			t.right(144);
		}
		t.right(144);
		for(i=0;i<5;i++) {
			t.forward(100);
			t.right(144);
		}
	}

}
