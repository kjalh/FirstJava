import java.io.*;
import java.util.*;

public class Code08_EX08 {

	public static void main(String[] args) {
		File src = new File("c:\\");
		File []list = src.listFiles();
		long max = -1;
		int mmax = 0;
				
		for(int i = 0; i < list.length; i++) {
			if(max<list[i].length()) {
				max = list[i].length();
				mmax = i;
			}			
		}
		System.out.println("가장 큰 파일은 "+list[mmax].getPath()+"  "+list[mmax].length()+"바이트");
		
	}

}
