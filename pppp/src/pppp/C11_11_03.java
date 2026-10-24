package pppp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class C11_11_03 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/normal.txt"));
		FileWriter fw = new FileWriter("c:/FirstJava/C11_11_c03.txt");
		int i=0;
		
		while(true) {
			String c = br.readLine();
			if(c == null)
				break;
			i++;
			fw.write(i + "행: " + c + "\n");
			System.out.print(i + "행: " + c + "\n");
			
		}
		br.close();
		fw.close();

	}

}
