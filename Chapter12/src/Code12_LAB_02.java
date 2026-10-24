import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Code12_LAB_02 {

	static int x1,y1,x2,y2;
	static class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(x1, y1, x2, y2);
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("선 그리기");
		frame.setLayout(new CardLayout());
		
		MyPanel panel = new MyPanel();
		panel.setBackground(Color.yellow);
		frame.add(panel,BorderLayout.CENTER);
		
		panel.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
			}
			public void mouseReleased(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();
				panel.repaint();
			}
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mouseEntered(MouseEvent e) {
				
			}
			public void mouseExited(MouseEvent e) {
				
			}
		});
		frame.setSize(250,250);
		frame.setVisible(true);
	}

}
