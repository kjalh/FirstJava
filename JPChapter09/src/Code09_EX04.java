import javax.swing.*;
import java.awt.*;

public class Code09_EX04 extends JFrame{
	public Code09_EX04() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		Color [] color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.magenta,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		
		
		
		for(int i = 0; i < 10; i++) {
			JButton button = new JButton(Integer.toString(i));
            button.setOpaque(true);
            button.setBackground(color[i]); 
            c.add(button);
		}
		
		
		setSize(600, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Code09_EX04();

	}

}
