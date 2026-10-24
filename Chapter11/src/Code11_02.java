import java.io.BufferedReader;
import java.io.FileReader;

public class Code11_02 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/myData1.txt"));
		String inStr;
		
		while(true) {
			inStr = br.readLine();
			if(inStr == null)
				break;
			System.out.println(inStr);
		}
		br.close();
	}

}
