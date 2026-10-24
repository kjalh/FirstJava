package pppp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class C12_12_04 {

	static int[][] rectAry = new int[100][4];
	static Color[] colorAry = new Color[100];
	static int x1, x2, y1, y2, a = 0;
	
	static class MyPanel4 extends JPanel{
		
		MyPanel4() {
			addMouseListener(new MouseListener() {
				@Override
				public void mousePressed(MouseEvent e) {
					x1 = e.getX();
					y1 = e.getY();
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					x2 = e.getX();
					y2 = e.getY();
					
					rectAry[a][0] = x1;
					rectAry[a][1] = y1;
					rectAry[a][2] = x2 - x1;
					rectAry[a][3] = y2 - y1;
					
					a++;
					
					repaint();				
				}
				@Override
				public void mouseExited(MouseEvent e) {}
				
				@Override
				public void mouseEntered(MouseEvent e) {}
				
				@Override
				public void mouseClicked(MouseEvent e) {}
			});		
		}
		
		public void paintComponent(Graphics g) {
			for(int i = 0; i < 100; i++) {
				g.setColor(colorAry[i]);
				g.drawRect(rectAry[i][0],rectAry[i][1],rectAry[i][2], rectAry[i][3]);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyPanel4 panel = new MyPanel4();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("연습");
	
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
