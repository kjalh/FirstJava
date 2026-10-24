import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code11_EX09 extends JFrame {
	private ImageIcon [] gbbImage = { 
			new ImageIcon("C:/FirstJava/JPChapter11/images/가위.jpg"),
			new ImageIcon("C:/FirstJava/JPChapter11/images/바위.jpg"),
			new ImageIcon("C:/FirstJava/JPChapter11/images/보.jpg")
	};
	private static String Bi = "Same !!!";
	private static String WIN = "ME !!!";
	private static String CWIN = "Computer !!!";
	
	public Code11_EX09() {
		setTitle("가위 바위 보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		

		setSize(400,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
	new Code11_EX09();
		
	}

}
