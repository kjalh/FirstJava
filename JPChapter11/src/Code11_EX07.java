import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Code11_EX07 extends JFrame{
	private JSlider slider = new JSlider(0, 100);
	private JLabel label = new JLabel("		I Love Java		");
	
	public Code11_EX07() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(slider, BorderLayout.NORTH);
		c.add(label, BorderLayout.CENTER);
		
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);

		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		label.setFont(new Font("고딕", Font.PLAIN, slider.getValue()));	
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider s = (JSlider)e.getSource();
				label.setFont(new Font("고딕", Font.PLAIN, s.getValue()));
			}
		});
		
		setSize(300,300);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Code11_EX07();

	}

}
