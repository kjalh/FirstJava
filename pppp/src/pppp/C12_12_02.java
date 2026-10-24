package pppp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C12_12_02 {

	static int[][] rectAry = new int[100][4];
	static Color[] colorAry = new Color[100];
	static int x1, x2, y1, y2, i = 0;
	
	static class MyPanel2 extends JPanel {
		
		public MyPanel2() {
			addMouseListener(new MouseListener() {
				
				public void mousePressed(MouseEvent e) {
					x1 = e.getX();
					y1 = e.getY();
				}

				public void mouseClicked(MouseEvent e) {}

				@Override
				public void mouseReleased(MouseEvent e) {
					x2 = e.getX();
					y2 = e.getY();
					
					rectAry[i][0] = x1;
					rectAry[i][1] = y1;
					rectAry[i][2] = x2-x1;
					rectAry[i][3] = y2-y1;
					
					i++;
					
					repaint();
				}
				@Override
				public void mouseEntered(MouseEvent e) {}

				@Override
				public void mouseExited(MouseEvent e) {}

			});
			
		}
		public void paintComponent(Graphics g) {
			for(int i = 0; i < 100; i++) {
				g.setColor(colorAry[i]); 
				g.drawRect(rectAry[i][0],rectAry[i][1],rectAry[i][2],rectAry[i][3]);
			}
		}	
	}


	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyPanel2 panel = new MyPanel2();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("연습문제");
		
		for(int i = 0; i < colorAry.length; i++) {
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			colorAry[i] = new Color(r, g, b);
			}
		
	
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
	}

}
