import javax.swing.*;
import java.awt.*;

public class Code09_EX07 extends JFrame{
	public Code09_EX07(){
		setTitle("계산기 프레임");
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
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		add(new JLabel("수식입력"));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JTextField(20));
		
		
	}
}
class jung extends JPanel{
	public jung() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4,4));
		
		for(int i=0; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			add(b);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
		
		JButton [] b = {new JButton("+"),new JButton("-"),new JButton("X"),new JButton("/")};
		
		for(int i = 0; i < b.length;i++) {
			b[i].setBackground(Color.blue);
			add(b[i]);
		}
	
	}
}
class nam extends JPanel{
	public nam() {
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("계산 결과"));
		add(new JTextField(20));
	}
}
	public static void main(String[] args) {
		new Code09_EX07();

	}

}
