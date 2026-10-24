package pppp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class C12_10_02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("연습문제");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,25,25));
		
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
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		bg.add(radio3);
		bg.add(radio4);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(radio1.isSelected()) {
					JOptionPane.showMessageDialog(frame, "포르쉐 선택", "제목", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(radio2.isSelected()) {
					JOptionPane.showMessageDialog(frame, "벤츠", "제목", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(radio3.isSelected()) {
					JOptionPane.showMessageDialog(frame, "BMW", "제목", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(radio4.isSelected()) {
					JOptionPane.showMessageDialog(frame, "아우디", "제목", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
		
		
		
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}

}
