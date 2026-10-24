import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.event.*;

public class Code11_EX01 extends JFrame {
	private JButton btn = new JButton("test button");
	
	public Code11_EX01() {
		setTitle("CheckBox Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());	
		
		JCheckBox a = new JCheckBox("버튼 비활성화");
		JCheckBox b = new JCheckBox("버튼 감추기");
		c.add(a);
		c.add(b);		
		c.add(btn);
		
		a.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		
		b.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Code11_EX01();

	}

}
