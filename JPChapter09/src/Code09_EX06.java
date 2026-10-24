import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Code09_EX06 extends JFrame{
	
	public Code09_EX06() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i = 0; i < 20; i++) {
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			
			JLabel label = new JLabel();
			
			label.setBackground(Color.blue);
			label.setLocation(x, y);
			label.setSize(10,10);
			label.setOpaque(true);
			c.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Code09_EX06();

	}

}
