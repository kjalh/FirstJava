import java.util.Scanner;
class Code04_07_1{
	String title, author;
	public Code04_07_1(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
public class Code04_07 {

	public static void main(String[] args) {
		Code04_07_1[] book = new Code04_07_1[2];
		Scanner scanner = new Scanner(System.in);
				
		for(int i = 0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Code04_07_1(title, author);
		}
		for(int i = 0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		
		scanner.close();

	}

}
