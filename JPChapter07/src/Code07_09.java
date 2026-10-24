class GStack09<T>{
	int tos;
	Object [] stck;
	public GStack09() {
		tos = 0;
		stck = new Object[10];
	}
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	@SuppressWarnings("unchecked")
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}
class GenericMethodEx09 {
	static <T> void toStack(T[] a, GStack09<T> gs) {
		for (int i=0; i<a.length; i++) {
			gs.push(a[i]);
		}
	}
}
public class Code07_09 {

	public static void main(String[] args) {
		GStack09<String> stringStack = new GStack09<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop());
		
		GStack09<Integer> intStack = new GStack09<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
	
		for(int n=0; n<3; n++)
			System.out.println(intStack.pop());

	}

}
