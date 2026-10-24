package pppp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pppp.C12_12_03.MyPanel3;


public class C12_12_06 {
	
	static int[][] setAry = new int[100][4];
	static Color[] colorAry = new Color[100];
	static int x1, y1, x2, y2, a=0; 
	
	static class MyPanel extends JPanel{
	
		MyPanel(){
			addMouseListener(new MouseAdapter() {
				
				void MousePressed(MouseEvent e) {
					x1 = e.getX();
					y1 = e.getY();
				}
				void MouseReleased(MouseEvent e) {
					x2 = e.getX();
					y2 = e.getY();
					
					setAry[a][0] = Math.min(x1, x2);
					setAry[a][1] = Math.min(y1, y2);
					setAry[a][2] = Math.abs(x2 - x1);
					setAry[a][3] = Math.abs(y2 - y1);
					
					a++;
					
					repaint();
				}		
			});		
		}
		
		
		protected void paintComponent(Graphics g) {
			for(int i = 0; i < 100; i++) {
				g.setColor(colorAry[i]);
				g.drawRect(setAry[a][0],setAry[a][1],setAry[a][2],setAry[a][3]);		
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
			
			colorAry[i] = new Color(r, g, b);
			
		}
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500,500);	
	}

}
