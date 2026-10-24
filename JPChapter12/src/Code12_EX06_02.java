import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code12_EX06_02 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Code12_EX06_02() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w = this.getWidth();
			int h = this.getHeight();
			int[] x = { w / 2, 0, w / 2, w };
			int[] y = { 0, h / 2, h, h / 2 };
			int xSpace = (int) this.getWidth() / 30;
			int ySpace = (int) this.getHeight() / 30;
			g.drawPolygon(x, y, 4);
			for (int i = 1; i < 10; i++) {
				y[0] += ySpace;
				x[1] += xSpace;
				y[2] -= ySpace;
				x[3] -= xSpace;
				g.drawPolygon(x, y, 4);
			}
		}
	}
	
	public static void main(String[] args) {
		new Code12_EX06_02();

	}

}
