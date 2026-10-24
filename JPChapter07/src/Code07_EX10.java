import java.util.*;

abstract class Shape10 {
    public abstract void draw();
}

class Line10 extends Shape10 {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect10 extends Shape10 {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle10 extends Shape10 {
    public void draw() {
        System.out.println("Circle");
    }
}
class GraphicEditor10 {
    private Scanner s = new Scanner(System.in);
    private Vector<Shape10> v = new Vector<>();

    public void insert() {
        System.out.print("Line(1), Rect(2), Circle(3)>> ");
        int sha = s.nextInt();

        Shape10 obj = null;

        if (sha == 1) obj = new Line10();
        else if (sha == 2) obj = new Rect10();
        else if (sha == 3) obj = new Circle10();

        if (obj != null) {
            v.add(obj);
        }
    }

    public void delete() {
        System.out.print("삭제할 도형의 위치 >> ");
        int d = s.nextInt();

        if (d < 1 || d > v.size()) {
            System.out.println("삭제할 수 없습니다.");
            return;
        }

        v.remove(d - 1);
    }

    public void view() {
        for (Shape10 s : v) {
            s.draw();
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
public class Code07_EX10 {

	public static void main(String[] args) {
		GraphicEditor10 e = new GraphicEditor10();
        e.run();

	}

}
