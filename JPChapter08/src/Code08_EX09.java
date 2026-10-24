import java.io.*;

public class Code08_EX09 {

	public static void main(String[] args) {
		File f = new File("C:\\자바_파일_저장\\8장\\텍스트_파일");
		File [] fl = f.listFiles();
		
		System.out.println(f.getPath() + "디렉터리의 .txt 파일을 모두 삭제합니다....");
		
		int num = 0;
		
		for(int i = 0; i < fl.length; i++) {
			String d = fl[i].getName();
			int name = d.lastIndexOf(".txt");
			
			if(name != -1) {
				System.out.println(fl[i].getName() + " 삭제");
				fl[i].delete();
				num++;
			}
	
		}
		System.out.println("총 "+num+"개의 .txt파일을 삭제했습니다.");
	}

}
