
public class Code04_05 {
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public Code04_05() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public Code04_05(String title) {
		this(title,"작자미상");
	}
	public Code04_05(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Code04_05 littlePrince = new Code04_05("어린완자", "생텍쥐페리");
		Code04_05 loveStory = new Code04_05("춘향전");
		Code04_05 emptyCode04_05 = new Code04_05();
		loveStory.show();
	}

}
