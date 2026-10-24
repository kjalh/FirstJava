import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Code11_EX06 extends JFrame{
	private JSlider slider = new JSlider(0, 100);
	private JTextArea ta = new JTextArea(4, 24);
	
	public Code11_EX06(){
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());	
		c.add(ta);
		c.add(slider);
		
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		
		
		 ta.addKeyListener(new KeyAdapter() {
			 public void keyTyped(KeyEvent e) {
				 String s = ta.getText();
	                if (s.length() <= 100)
	                    slider.setValue(s.length());
	                else {
	                    s = s.substring(0, 99);
	                    ta.setText(s);
	                }
	            }
	        });

	     
	      slider.addChangeListener(new ChangeListener() {
	           public void stateChanged(ChangeEvent e) {
	        	   int value = slider.getValue();
	               String currentString = ta.getText();
	               int textLength = currentString.length();

	               if (textLength > value) {
	            	   ta.setText(currentString.substring(0, value));
	                } 
	               else {
	                    slider.setValue(textLength);
	                }
	            }
	        });
			
		
		setSize(300, 170);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Code11_EX06();

	}

}
