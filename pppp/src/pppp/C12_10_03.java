package pppp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class C12_10_03 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("연습문제");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50,20));
		
		JRadioButton radio1 = new JRadioButton("포르쉐");
		JRadioButton radio2 = new JRadioButton("벤츠");
		JRadioButton radio3 = new JRadioButton("BMW");
		JRadioButton radio4 = new JRadioButton("아우디");
		frame.add(radio1);
		frame.add(radio2);
		frame.add(radio3);
		frame.add(radio4);
		
		JButton btn1 = new JButton("클릭하세요");
		frame.add(btn1);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(radio1);
		grp.add(radio2);
		grp.add(radio3);
		grp.add(radio4);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(radio1.isSelected())
					JOptionPane.showMessageDialog(frame, "포르쉐 선택", "포르쉐", JOptionPane.INFORMATION_MESSAGE);
				else if(radio2.isSelected())
					JOptionPane.showMessageDialog(frame, "벤츠 선택", "벤츠", JOptionPane.INFORMATION_MESSAGE);
				else if(radio3.isSelected())
					JOptionPane.showMessageDialog(frame, "BMW 선택", "BMW", JOptionPane.INFORMATION_MESSAGE);
				else if(radio4.isSelected())
					JOptionPane.showMessageDialog(frame, "아우디 선택", "아우디", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
