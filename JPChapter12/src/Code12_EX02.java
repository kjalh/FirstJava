import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code12_EX02 extends JFrame {
	public Code12_EX02(){
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());

		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/하요이.jpg");
		private Image image = icon.getImage();
		private Point point = new Point(50, 50);

		public MyPanel() {
			this.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					point = e.getPoint();
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval((int) point.getX(), (int) point.getY(), 40, 40);
		}
	}
	public static void main(String[] args) {
		new Code12_EX02();

	}

}
