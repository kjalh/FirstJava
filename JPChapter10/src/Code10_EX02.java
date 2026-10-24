import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code10_EX02 extends JFrame{
	public Code10_EX02() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JLabel label = new JLabel();
		c.add(label);
		c.setBackground(Color.GREEN);
		
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) { 
				c.setBackground(Color.YELLOW);
			}
			
		});
		c.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) { 
				c.setBackground(Color.GREEN);
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Code10_EX02();

	}

}
