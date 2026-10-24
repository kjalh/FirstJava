
public class Code04_04 {
	String title;
	String author;
	
	public Code04_04(String t) {
		title = t;
		author = "작자미상";
	}
	public Code04_04(String t, String a) {
		title = t;
		author = a;
	}
	public static void main(String[] args) {
		Code04_04 littlePrince = new Code04_04("어린왕자", "생텍쥐페리");
		
		Code04_04 loveStory = new Code04_04("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);

	}

}
