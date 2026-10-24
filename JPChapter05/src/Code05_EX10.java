abstract class PairMap10{
	protected String keyArray [];
	protected String valueArray []; 
	
	abstract String get(String key); 
	abstract void put(String key, String value);
	
	abstract String delete(String key);
	abstract int length();
}

class Dictionary10 extends PairMap10{
	int num = 0;
	public Dictionary10(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
	}

	@Override
	String get(String key) {
		for (int i = 0; i < num; i++)
			if (keyArray[i].equals(key))
				return valueArray[i];
		return null;
	}

	@Override
	void put(String key, String value) {
		for (int i = 0; i < num; i++) {//2
			if (keyArray[i].equals(key)) {
				valueArray[i] = value;
			}
		}
		keyArray[num] = key;
		valueArray[num++] = value;
	}

	@Override
	String delete(String key) {
		for (int i = 0; i < num; i++) {
	        if (keyArray[i].equals(key)) {
	            valueArray[i] = null;  
	        }
	    }
	    return null;
	}

	@Override
	int length() {
		return num;
	}	
}

public class Code05_EX10 {

	public static void main(String[] args) {
		Dictionary10 dic = new Dictionary10(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태")); 
		dic.delete("황기태"); 
		System.out.println("황기태의 값은 "+ dic.get("황기태"));

	}

}
