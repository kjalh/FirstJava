import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code11_EX04 extends JFrame {
	private int[] cal = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
	private String[] text = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"}; 
	private JTextField Input;
	private JTextField[] tf = new JTextField[8]; 
	private JCheckBox[] cb = new JCheckBox[8];

	public Code11_EX04() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(null);

		JLabel la = new JLabel("금액");
		la.setHorizontalAlignment(JLabel.RIGHT);
		la.setSize(50, 20);
		la.setLocation(20, 20);
		add(la);

		Input = new JTextField(30);
		Input.setSize(100, 20);
		Input.setLocation(100, 20);
		add(Input);

		JButton calcBtn = new JButton("계산");
		calcBtn.setSize(70, 20);
		calcBtn.setLocation(210, 20);
		add(calcBtn);

		for (int i = 0; i < text.length; i++) {
			la = new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(20, 50 + i * 25);
			add(la);

			tf[i] = new JTextField(5);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setSize(50, 20);
			tf[i].setLocation(100, 50 + i * 25);
			add(tf[i]);

			cb[i] = new JCheckBox();
			cb[i].setBackground(Color.PINK);
			cb[i].setSize(20, 20);
			cb[i].setLocation(200, 50 + i * 25);
			cb[i].setSelected(true);
			add(cb[i]);
		}

		calcBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = Input.getText();
				if (str.length() == 0) return;

				try {
					int money = Integer.parseInt(str);
					for (int i = 0; i < cal.length; i++) {
						if (cb[i].isSelected()) {
							int res = money / cal[i];
							tf[i].setText(Integer.toString(res));
							money %= cal[i];
						} else {
							tf[i].setText("0");
						}
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "숫자를 입력하세요");
				}
			}
		});

		setSize(300, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Code11_EX04();
	}
}
