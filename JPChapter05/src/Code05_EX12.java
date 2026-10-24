import java.util.Scanner;

abstract class Shape12 {
    private Shape12 next;
    public Shape12() {next = null; }
    public void setNext(Shape12 obj) { next = obj;}
    public Shape12 getNext() {return next;}
    public abstract void draw();
}


class Line12 extends Shape12 {
	public void draw() { System.out.println("Line"); }
}

class Rect12 extends Shape12 {
	public void draw() { System.out.println("Rect"); }
}

class Circle12 extends Shape12 {
	public void draw() { System.out.println("Circle"); }
}




class GraphicEditor12 {
	private Scanner s = new Scanner(System.in);
	private Shape12 f, l;

	public void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>> ");
		int sha = s.nextInt();
		
		Shape12 obj = null;
		
		if (sha == 1) obj = new Line12();
		else if (sha == 2) obj = new Rect12();
		else if (sha == 3) obj = new Circle12();
		if (obj == null) return;

		if (f == null) f = l = obj;
		else {
			l.setNext(obj);
			l = obj;
		}
	}

	public void delete() {
		System.out.print("삭제할 도형의 위치 >> ");
		int d = s.nextInt();
		
		if (f == null) {
			System.out.println("삭제할 수 없습니다.");
			return;
		}
		if (d == 1) {
			f = f.getNext();
			if (f == null) l = null;
			return;
		}

		Shape12 p = f, c = f.getNext();
		int index = 2;
		while (c != null && index < d) {
			p = c;
			c = c.getNext();
			index++;
		}
		if (c == null) {
			System.out.println("삭제할 수 없습니다.");
		} else {
			p.setNext(c.getNext());
			if (c == l) l = p;
		}
	}

	public void view() {
		Shape12 c = f;
		while (c != null) {
			c.draw();
			c = c.getNext();
		}
	}

	public void run() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int m = s.nextInt();
			if (m == 1) insert();
			else if (m == 2) delete();
			else if (m == 3) view();
			else if (m == 4) {
				System.out.println("beauty를 종료합니다.");
				break;
			}
		}
	}
}

public class Code05_EX12 {
    public static void main(String[] args) {
        GraphicEditor12 e = new GraphicEditor12();
        e.run();
    }
}
