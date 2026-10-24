import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code10_EX04 extends JFrame{
	public Code10_EX04() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT){
					JLabel label = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(label.getText());				
					text = text.append(text.substring(0, 1));
					label.setText(text.deleteCharAt(0).toString());
				}
			}
		});
		label.setFocusable(true);
		label.requestFocus();
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Code10_EX04();

	}

}
