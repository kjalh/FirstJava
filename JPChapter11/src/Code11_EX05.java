import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Code11_EX05 extends JFrame{
	private JSlider slider = new JSlider(100,200);
	private JLabel label = new JLabel(" ");
	
	public Code11_EX05(){
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(slider);
		
		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		label.setBackground(Color.GREEN);
		label.setText(Integer.toString(slider.getValue()));
		c.add(label);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider s = (JSlider)e.getSource();
				label.setText(Integer.toString(s.getValue()));
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Code11_EX05();

	}

}
