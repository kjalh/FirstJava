import java.io.*;
import java.util.*;

public class Code08_EX07 {

	public static void main(String[] args) {
		File src = new File("a.jpg");
		File dest = new File("b.jpg");
		
		try {
			BufferedInputStream srcStream = new BufferedInputStream(new FileInputStream(src));
			BufferedOutputStream destStream = new BufferedOutputStream(new FileOutputStream(dest));
			
			long Imgpsize = src.length() / 10;
			long Imgpread = 0;
			int tread = 0;
		
			System.out.println("a.jpg를 b.jpg로 복사합니다.");
			
			byte [] buf = new byte [1024];
			
			System.out.println("10%마다 *를 출력합니다.");
			while(true) {
				tread = srcStream.read(buf, 0, buf.length);
				if(tread == -1) {
					if(Imgpread > 0) { 
						System.out.print("*");
					}
					break; 
				}
				if (tread > 0)
					destStream.write(buf, 0, tread);
				
				Imgpread += tread;
				if (Imgpread >= Imgpsize) {
					System.out.print("*") ;
					Imgpread = 0;
				}
			}	
			srcStream.close();
            destStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	
		
		
	}

}
