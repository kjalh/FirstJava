import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code10_02 extends JFrame{
	public Code10_02() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener01());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	private class MyActionListener02 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			Code10_02.this.setTitle(b.getText());
			
		}
	}
	public static void main(String[] args) {
		new Code10_02();

	}

}
