package pppp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class C12_10_05 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("연습");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
		
		
		JRadioButton radio1 = new JRadioButton("포르쉐");
		frame.add(radio1);
		JRadioButton radio2 = new JRadioButton("벤츠");
		frame.add(radio2);
		JRadioButton radio3 = new JRadioButton("BMW");
		frame.add(radio3);
		JRadioButton radio4 = new JRadioButton("아우디");
		frame.add(radio4);
		
		JButton btn = new JButton("클릭하세요");
		frame.add(btn);
		ButtonGroup grp = new ButtonGroup();
		grp.add(radio1);
		grp.add(radio2);
		grp.add(radio3);
		grp.add(radio4);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(radio1.isSelected()) {
					JOptionPane.showMessageDialog(frame, "포르쉐 선택");
				}
				else if(radio2.isSelected()) {
					JOptionPane.showMessageDialog(frame, "벤츠 선택");
				}
				else if(radio3.isSelected()) {
					JOptionPane.showMessageDialog(frame,"BMW 선택");
				}
				else if(radio4.isSelected()) {
					JOptionPane.showMessageDialog(frame, "아우디 선택");
				}
			}
			
		});
		
		frame.setVisible(true);
		frame.setSize(300,300);
		
		
	}

}
