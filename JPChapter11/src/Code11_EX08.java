import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Code11_EX08 extends JFrame{
	private JRadioButton lbtn = new JRadioButton("left");
	private JRadioButton rbtn = new JRadioButton("right");
	private JLabel imageLabel;
	private Vector<ImageIcon> imagesVector = new Vector<ImageIcon>();
	private int index = 0;

	public Code11_EX08() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());	
		c.add(lbtn);
		c.add(rbtn);
		
		ButtonGroup g = new ButtonGroup();
		g.add(lbtn);
		g.add(rbtn);
		
		imagesVector.add(new ImageIcon("C:/FirstJava/JPChapter11/은행사진.jpeg"));
		imagesVector.add(new ImageIcon("C:/FirstJava/JPChapter11/풍경사진.jpeg"));
		
		
		imageLabel = new JLabel();
		c.add(imageLabel);
		
		lbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 0;
				imageLabel.setIcon(imagesVector.get(index));
			}
		});

		rbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = 1;
				imageLabel.setIcon(imagesVector.get(index));
			}
		});

		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Code11_EX08();

	}

}
