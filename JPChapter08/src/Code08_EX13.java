import java.io.*;
import java.util.*;

public class Code08_EX13 {

    public static void main(String[] args) {
        File f = new File("c:\\");
        File [] fl = f.listFiles();; 
        Scanner s = new Scanner(System.in);  

        try {
            System.out.println("***** 파일 탐색기입니다. *****");
            
            while (true) { 
                String nd = f.getParent() + "\\" + f.getName();
                System.out.printf("\t[%s]\n", nd); 
                   
                for (int i = 0; i < fl.length; i++) {
                    String dir;
                    if (fl[i].isDirectory()) dir = "dir";
                    else dir = "file";
                    
                    System.out.printf("%-5s\t%15d바이트\t%-10s\n", dir, fl[i].length(), fl[i].getName());
                }
                
                System.out.print(">> ");
                String find = s.next();
                
                if (find.equals("그만")) break;

                
                if (find.equals("..")) {
                    if (f.getParent() == null) continue; 
                    else {
                        f = new File(f.getParent());
                    }
                } else {
                   
                    if (new File(f, find).isDirectory()) {
                        f = new File(f, find);
                    } else {
                        System.out.println("디렉토리가 아닙니다.");
                    }
                }


                fl = f.listFiles();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}