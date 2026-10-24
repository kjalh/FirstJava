import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Code11_LAB_02 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/myData1.txt"));
		FileWriter fw = new FileWriter("C:/FirstJava/newFile.txt");
		String inStr;
		
		while(true) {
			inStr = br.readLine();
			if(inStr == null)
				break;
			fw.write(inStr + "\n");
		}
		br.close();
		fw.close();
		System.out.println("--- myData1.txt가 newFile.txt로 복사되었음 ---");
	}

}
