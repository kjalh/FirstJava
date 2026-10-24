import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Code12_17 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("메뉴");
		frame.setLayout(new FlowLayout());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenu editMenu = new JMenu("편집");
		JMenuItem newItem = new JMenuItem("새 문서");
		JMenuItem openItem = new JMenuItem("열기");
		JMenuItem closeItem = new JMenuItem("닫기");

		frame.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(closeItem);
		
		JLabel label = new JLabel("여기 글자가 바뀝니다.");
		frame.add(label);
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("[새 문서]를 선택했어요.");
			}
		});
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("[열기]를 선택했어요.");
			}
		});
		
		closeItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}

}
