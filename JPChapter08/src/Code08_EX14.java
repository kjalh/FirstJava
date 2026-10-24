import java.io.*;
import java.util.*;

public class Code08_EX14 {

    public static void main(String[] args) {
        File f = new File("c:\\");
        File[] fl = f.listFiles();
        Scanner s = new Scanner(System.in);  

        try {
            System.out.println("***** 파일 탐색기입니다. *****");
            
            while (true) { 
                String nd = f.getParent() + "\\" + f.getName();
                System.out.printf("\t[%s]\n", nd); 
                   
                for (int i = 0; i < fl.length; i++) {
                    String dir = fl[i].isDirectory() ? "dir" : "file";
                    System.out.printf("%-5s\t%15d바이트\t%-10s\n", dir, fl[i].length(), fl[i].getName());
                }
                
                System.out.print(">> ");
                String find = s.nextLine();

                StringTokenizer st = new StringTokenizer(find);
                
                try {
                    find = st.nextToken();
                    
                    
                    if (find.equals("그만"))break;
                    

                    
                    if (find.equals("..")) {
                        if (f.getParent() != null) {
                            f = new File(f.getParent());
                        }
                        continue;
                    }

                    
                    if (find.equals("rename")) {
                        if (st.countTokens() < 2) {
                            System.out.println("파일 이름을 두 개 입력해야 합니다.");
                            continue;
                        }
                        String on = st.nextToken();
                        String nn = st.nextToken();
                        File of = new File(f, on);
                        File nf = new File(f, nn);
                        
                        if (of.exists() && of.isFile()) {
                            if (of.renameTo(nf)) {
                                System.out.println(on + " 파일이 " + nn + "로 변경되었습니다.");
                            } else {
                                System.out.println("파일 이름 변경 실패.");
                            }
                        } else {
                            System.out.println("파일이 존재하지 않거나 디렉터리입니다.");
                        }
                    }

                    
                    else if (find.equals("mkdir")) {
                        if (st.countTokens() < 1) {
                            System.out.println("디렉터리 이름을 입력해야 합니다.");
                            continue;
                        }
                        String dirName = st.nextToken();
                        File newDir = new File(f, dirName);
                        
                        if (newDir.mkdir()) {
                            System.out.println("디렉터리 " + dirName + "가 생성되었습니다.");
                        } else {
                            System.out.println("디렉터리 생성 실패 또는 이미 존재합니다.");
                        }
                    }

                    
                    else {
                        File temp = new File(f, find);
                        if (temp.isDirectory()) {
                            f = temp;
                        } else {
                            System.out.println("디렉토리가 아닙니다.");
                        }
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("잘못된 명령어 형식입니다. 예: rename old.txt new.txt, mkdir newdir");
                }

                
                fl = f.listFiles();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}