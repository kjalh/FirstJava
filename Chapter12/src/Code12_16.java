import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Code12_16 {
	static class MyPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawLine(10,10,100,100);
			
			g.setColor(Color.RED);
			g.drawOval(30, 30, 50, 30);
			g.fillOval(130, 30, 50, 50);
			
			g.setColor(Color.GREEN);
			g.drawRect(130,130, 50, 50);
			
			g.setColor(Color.MAGENTA);
			g.fillRect(100,100,50,50);
			
		}
	}

	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("도형 그리기");
		frame.setLayout(new CardLayout());
		
		MyPanel panel = new MyPanel();
		frame.add(panel, BorderLayout.CENTER);
		
		frame.setSize(250,250);
		frame.setVisible(true);
	}

}
