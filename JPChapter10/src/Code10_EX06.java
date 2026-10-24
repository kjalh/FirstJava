import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code10_EX06 extends JFrame{
	public Code10_EX06() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setSize(20,20);
		la.setLocation(100, 100);
		c.add(la);
		
		la.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				int x = (int)(Math.random() * 150);
                int y = (int)(Math.random() * 150);
				la.setLocation(x, y);
			}
		});
	
		
		la.setFocusable(true);
		la.requestFocus();

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Code10_EX06();

	}

}
