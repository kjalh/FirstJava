import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code10_04 extends JFrame{
	private JLabel la = new JLabel("Hello");
	
	public Code10_04() {
		setTitle("Mouse 이번트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}

		
	}
	
	public static void main(String[] args) {
		new Code10_04();

	}

}
