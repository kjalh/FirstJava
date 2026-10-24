class GStack10<T>{
	int tos;
	Object [] stck;
	public GStack10() {
		tos = 0;
		stck = new Object [10];
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
public class Code07_10 {
	public static <T> GStack10<T> reverse(GStack10<T> a) {
		GStack10<T> s = new GStack10<T>(); 
		while (true) {
			T tmp;
			tmp = a.pop(); 
			if (tmp == null) 
				break;
			else
				s.push(tmp); 
		}
		return s;
	}
	public static void main(String[] args) {
		GStack10<Double> gs = new GStack10<Double>();

		for (int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);	
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}

	}

}
