public class p246_9 {

	public static void main(String[] args) {
		Parent a = new Parent();
		a.fn2();
		new Child(5).fn1();
	}
}
class Parent{
	public Parent() {
		this(3);
		System.out.print("A");
	}
	public Parent(int x) {
		System.out.print("B");
	}
	public void fn1() {
		System.out.print("C");
	}
	public void fn2() {
		System.out.print("D");
	}
}
class Child extends Parent{
	public Child() {
		System.out.print("E");
	}
	public Child(int x) {
		this();
		System.out.print("F");
	}
	public void fn1() {
		System.out.print("G");
	}
	public void fn2() {
		System.out.print("G");
	}
}
