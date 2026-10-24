import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Code12_21 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("입력 상자");
		frame.setLayout(null);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		int result = JOptionPane.showConfirmDialog(null, "선택하세요", "제목", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(result == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(frame, "Yes 누름");
		else if (result == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(frame, "NO 누름");
		else
			JOptionPane.showMessageDialog(frame, "Cancel 누름");
	}
}
