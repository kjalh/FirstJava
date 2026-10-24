class TV01{
	private int size;
	public TV01(int size) {this.size = size; }
	protected int getSize() {return size; }
}
class ColorTV01 extends TV01{
	int color;
	
	public ColorTV01(int size, int color) {
		super(size);
		this.color = color;
	}
	void printProperty() {
		System.out.printf("%d인치 %d컬러", getSize(), color);
	}

}
public class Code05_EX01 {

	public static void main(String[] args) {
		ColorTV01 myTV = new ColorTV01(32, 1024);
		myTV.printProperty();
	}

}
