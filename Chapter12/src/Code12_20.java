import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Code12_20 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("입력 상자");
		frame.setLayout(null);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		String name = JOptionPane.showInputDialog(frame,"이름 입력", "난생이");
		int age = Integer.parseInt(JOptionPane.showInputDialog(frame,"나이 입역", 21));
		
		JOptionPane.showMessageDialog(frame, name +", "+ age ,"결과", JOptionPane.PLAIN_MESSAGE);
	}

}
