import javax.swing.*;
import java.awt.*;

public class Code09_EX08 extends JFrame{
	public Code09_EX08() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.add(new buck(), BorderLayout.NORTH);
		c.add(new jung(), BorderLayout.CENTER);
		c.add(new nam(), BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
class buck extends JPanel{
	public buck() {
		setBackground(Color.GRAY);

		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}

class jung extends JPanel{
	public jung() {
		setBackground(Color.WHITE);

		setLayout(null);
		
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 100) + 50;
			int y = (int)(Math.random() * 100) + 50;
			
			JLabel label = new JLabel("*");
			
			label.setForeground(Color.red);
			label.setLocation(x, y);
			label.setSize(10,10);		
			add(label);
		}
	}
}

class nam extends JPanel{
	public nam() {
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Word Input"));
		add(new JTextField(15));
	}
}
	public static void main(String[] args) {
		new Code09_EX08();

	}

}
