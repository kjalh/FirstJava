import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Code12_14 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("마우스 이벤트1");
		frame.setLayout(new FlowLayout());
		
		frame.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}
			public void mouseClicked(MouseEvent e) {
				switch(e.getButton()) {
				case 1 : JOptionPane.showMessageDialog(null,"왼쪽 버튼~~");
					break;
				case 2 : JOptionPane.showMessageDialog(null, "가운데 버튼~~");
					break;
				case 3 : JOptionPane.showMessageDialog(null, "오른쪽 버튼~~");
					break;
				}
			}
			public void mouseEntered(MouseEvent e) {
				
			}
			public void mouseExited(MouseEvent e) {
				
			}
		});
		
		frame.setSize(250,250);
		frame.setVisible(true);
	}

}
