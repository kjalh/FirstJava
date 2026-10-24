import java.util.ArrayList;

public class Code07_EX09_MyStack<T> implements IStack<T> {
	ArrayList<T> L = null;
	public Code07_EX09_MyStack() {
		L = new ArrayList<T>();
	}

	@Override
	public T pop() {
		if (L.size() == 0)
			return null; 
		else {
			return L.remove(0); 
		}
	}

	@Override
	public boolean push(T ob) {
		L.add(0, ob); 
		return true;
	}
	
	public static void main(String[] args) {}
}
