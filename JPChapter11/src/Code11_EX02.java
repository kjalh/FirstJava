import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Code11_EX02 extends JFrame{
	private JTextField tf = new JTextField(10);
	private String [] names = {};
	
	public Code11_EX02() {
		setTitle("JTextField and JComBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(tf);
		
		JComboBox<String> nameCombo = new JComboBox<String>(); 
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);

		c.add(nameCombo);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				nameCombo.addItem(t.getText() + "\n"); 
				t.setText(""); 
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Code11_EX02();
	}

}
