import javax.swing.*;
import java.awt.*;

public class Code12_07 extends JFrame{
	private MyPanel panel = new MyPanel();
	
 	public Code12_07() {
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 300);
		setVisible(true);
	}

 	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg"); // 이미지 로딩
		private Image img = icon.getImage(); // 이미지 객체
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// 이미지를 패널 크기로 조절하여 그린다
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}	
	}
	public static void main(String[] args) {
		new Code12_07();

	}

}
