import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Code11_EX11 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("C:/FirstJava/normal.txt"));
		FileWriter fw = new FileWriter("C:/FirstJava/normal_line.txt");
		String inStr;
		int lineNum = 0;
		
		while(true) {
			lineNum++;
			inStr = br.readLine();
			if(inStr == null) 
				break;
			fw.write(lineNum + "행: " + inStr + "\n");
			
		}
		br.close();
		fw.close();		
	}

}
