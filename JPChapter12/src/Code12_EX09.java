import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Code12_EX09 extends JFrame{
	
	public Code12_EX09() {
		setTitle("Blue Label 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		BlueLabel blueLabel1 = new BlueLabel("hello");
		blueLabel1.setBackground(Color.RED);
		blueLabel1.setForeground(Color.YELLOW);
		c.add(blueLabel1);
		
		BlueLabel2 blueLabel2 = new BlueLabel2("Big Hello");
		blueLabel2.setOpaque(true);
		blueLabel2.setFont(new Font("TimesRoman", Font.ITALIC, 50));
		blueLabel2.setBackground(Color.RED);
		blueLabel2.setForeground(Color.MAGENTA);
		c.add(blueLabel2);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class BlueLabel extends JLabel {
		public BlueLabel(ImageIcon icon) {
			super(icon);
		}
		public BlueLabel(String text) {
			super(text);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.BLUE);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			super.paintComponent(g); // 본래 JLabel이 그리는 코드를 그대로 호출
		}
	}

	class BlueLabel2 extends JLabel {
		public BlueLabel2(ImageIcon icon) {
			super(icon);
		}
		public BlueLabel2(String text) {
			super(text);
		}	
		
		@Override
		public void setBackground(Color c) {
			super.setBackground(Color.BLUE);
			return;
		}
	}
	
	public static void main(String[] args) {
		new Code12_EX09();

	}
	
}
