import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code12_EX03 extends JFrame {
	private ImageIcon icon = new ImageIcon("images/하요이.jpg"); 	
	private JLabel imageLabel = new JLabel(icon);
	public Code12_EX03(){
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		imageLabel.setSize(icon.getIconHeight(),icon.getIconWidth());
		imageLabel.setLocation(100,100);

		MyMouseListener  ml = new MyMouseListener();
		imageLabel.addMouseListener(ml);
		imageLabel.addMouseMotionListener(ml);

		c.add(imageLabel); 
		setSize(1000,1000);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		private Point startP = null; 
		
		@Override
		public void mousePressed(MouseEvent e) {
			startP = e.getPoint();
		}
		

		@Override
		public void mouseReleased(MouseEvent e) {
			Point endP = e.getPoint();
			Component la = (JComponent)(e.getSource());
			Point p = la.getLocation();
			la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
			la.getParent().repaint();
		}	
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point endP = e.getPoint();
			Component la = (JComponent)(e.getSource());
			Point p = la.getLocation();
			la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
			la.getParent().repaint();
		}	
	}
	
	public static void main(String[] args) {
		new Code12_EX03();

	}

}
