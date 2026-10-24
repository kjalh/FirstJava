import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code10_EX05 extends JFrame{
	public Code10_EX05() {
		setTitle("+,-로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		c.add(la);

		
		
		la.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				
			}
		});
		
		
		
		la.setFocusable(true);
		la.requestFocus();
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Code10_EX05();

	}

}
