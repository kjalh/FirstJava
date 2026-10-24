import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code10_EX07 extends JFrame{
	public Code10_EX07() {
		setTitle("마우스 윌을 굴려 포튼 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		label.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n < 0) { 
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5)); 
				}
				else {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 
				}
			}
		});

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Code10_EX07();

	}

}
