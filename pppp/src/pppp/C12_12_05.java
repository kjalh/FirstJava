package pppp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class C12_12_05 {
	
	static int[][] rectAry = new int[100][4];
	static Color[] colorAry = new Color[100];
	static int x1, y1, x2, y2, a=0;
	
	static class MyPanel extends JPanel{

		MyPanel() {
			addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					x1 = e.getX();
					y1 = e.getY();
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					x2 = e.getX();
					y2 = e.getY();
					
					rectAry[a][0] = Math.min(x1, x2);
					rectAry[a][1] = Math.min(y1, y2);
					rectAry[a][2] = Math.abs(x2 - x1);
					rectAry[a][3] = Math.abs(y2 - y1);
					
					
					a++;
					repaint();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				
				
			});
			
			
			
		}
		
		
		public void paintComponent(Graphics g) {
			for(int i = 0; i < colorAry.length; i++) {
				g.setColor(colorAry[i]);
				g.drawRect(rectAry[i][0],rectAry[i][1],rectAry[i][2],rectAry[i][3]);
			}
		}
		
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("연습문제");
		
		MyPanel panel = new MyPanel();
		
		for(int i = 0; i < colorAry.length; i++) {
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			
			colorAry[i] = new Color(r,g,b);
			
		}
		frame.add(panel);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
