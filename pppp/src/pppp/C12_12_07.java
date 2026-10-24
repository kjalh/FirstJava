package pppp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C12_12_07 {
	static int[][] setAry = new int [100][4];
	static Color[] colorAry = new Color[100];
	static int x1, y1, x2, y2, a = 0;
	
	static class MyPanel extends JPanel{
		
		 MyPanel(){
			
			addMouseListener(new MouseAdapter() {

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
					
					setAry[a][0] = Math.min(x1, x2);
					setAry[a][1] = Math.min(y1, y1);
					setAry[a][2] = Math.abs(x2 - x1);
					setAry[a][3] = Math.abs(y2 - y1);
					
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
				g.drawRect(setAry[i][0], setAry[i][1], setAry[i][2], setAry[i][3]);

			}
			
		}
			
		
		
		
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("연습");
		
		MyPanel panel = new MyPanel();
		
		for(int i = 0; i < colorAry.length; i++) {
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			
			colorAry[i] = new Color(r, g, b);
		}
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500,500);
		
		
		
	}

}
