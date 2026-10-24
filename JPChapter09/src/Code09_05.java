import javax.swing.*;
import java.awt.*;

public class Code09_05 extends JFrame {
	public Code09_05() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		c.add(new Label(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new Label(" 학과"));
		c.add(new JTextField(""));
		c.add(new Label(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Code09_05();

	}

}
