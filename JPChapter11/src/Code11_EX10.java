import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Code11_EX10 extends JFrame {
	private JLabel num[]=new JLabel[10];
	private int nindex;
	
	public Code11_EX10() {
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<10;i++) {
			num[i]=new JLabel(Integer.toString(i));
			num[i].setSize(100,100);
			num[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel temp=(JLabel)e.getSource();
					int num=Integer.parseInt(temp.getText());
					
					if(num==nindex) {
						temp.setVisible(false);
						nindex++;
					}
					if(nindex==10) {
						setting();
					}
				}
			});
			c.add(num[i]);
		}
		
		setting();
		
		
		setSize(300,300);
		setVisible(true);
	}
	public void setting() {
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*150);
			int y=(int)(Math.random()*150);
			
			num[i].setLocation(x,y);
			num[i].setVisible(true);
		}
	}
	public static void main(String[] args) {
		new Code11_EX10();

	}

}
