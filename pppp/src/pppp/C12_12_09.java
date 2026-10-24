package pppp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel1 extends JPanel{
	static int[][] rectAry = new int[100][4];
	static Color[] colorAry = new Color[100];
	int x1;
	int x2;
	int y1;
	int y2;
	int a = 0;
	
	MyPanel1(){
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
			}
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
		});
	}
	public void paintComponent(Graphics g) {
		for(int i = 0; i<colorAry.length; i++) {
			g.setColor(colorAry[i]);
			g.drawRect(rectAry[i][0], rectAry[i][1], rectAry[i][2], rectAry[i][3]);
		}
		
	}
	
	
}


public class C12_12_09 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyPanel1 panel = new MyPanel1();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("연습");
		
		
		for(int i = 0; i<panel.colorAry.length;i++) {
			int r = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			
			panel.colorAry[i] = new Color(r,g,b);
		}
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500,500);
	}

}
