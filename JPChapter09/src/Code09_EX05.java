import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Code09_EX05 extends JFrame{
	public Code09_EX05() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,4);
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i = 0; i < 16; i++) {
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
				
			Color color = new Color(r, g, b);
				
			JLabel label = new JLabel(Integer.toString(i));
			label.setBackground(color);
			label.setOpaque(true);
			c.add(label);
		
		}
		setSize(600, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Code09_EX05();
	}

}
