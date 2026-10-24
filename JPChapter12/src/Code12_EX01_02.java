import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code12_EX01_02 extends JFrame {
	public Code12_EX01_02(){
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/하요이.jpg"); //허지율
		private Image img = icon.getImage();
		private JButton button = new JButton("Hide/Show");
		private boolean showFlag = true;
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(button);
			
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					showFlag = !showFlag; 
					MyPanel.this.repaint(); 
					
				}				
			});
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(showFlag)
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);			
		}
	}
	public static void main(String[] args) {
		new Code12_EX01_02();

	}

}
