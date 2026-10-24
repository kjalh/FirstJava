class TV02{
	private int size;
	public TV02(int size) {this.size = size; }
	protected int getSize() {return size; }
}

class IPTV02 extends TV02{	
	String ip;
	int color;
	
	public IPTV02(String ip, int size, int color) {
		super(size);
		this.ip = ip;
		this.color = color;
	}
	void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러", ip, getSize(), color);
	}
	
}

public class Code05_EX02 {

	public static void main(String[] args) {
		IPTV02 iptv = new IPTV02("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
