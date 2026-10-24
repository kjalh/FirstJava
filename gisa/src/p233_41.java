class static Parent{
	static int total = 0;
	int v = 1;
	public Parent() {
		total += (++v);
		show();
	}
	public void show() {
		total += total;
	}
}
class static Child extends Parent{
	int v = 10;
	public Child() {
		//super()생략
		v += 2;
		total += v++;
		show();
	}
	@Override
	public void show() {
		total += total*2;
	}
}

public class p233_41 {

	public static void main(String[] args) {
		new Child();
		System.out.println(Parent.total);
	}
}
