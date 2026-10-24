import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Code12_EX04 extends JFrame {
    public Code12_EX04() {
        setTitle("이미지 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new ImagePanel());
        setSize(1000, 1000);
        setVisible(true);
    }

    class ImagePanel extends JPanel {
        private Image img;
        private int imgX = 100, imgY = 100;
        private int offsetX, offsetY;     
        private boolean dragging = false;

        public ImagePanel() {
            img = new ImageIcon("images/하요이.jpg").getImage();

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    int width = img.getWidth(ImagePanel.this);
                    int height = img.getHeight(ImagePanel.this);
                    int mouseX = e.getX();
                    int mouseY = e.getY();

                    if (mouseX >= imgX && mouseX <= imgX + width &&
                        mouseY >= imgY && mouseY <= imgY + height) {
                        dragging = true;
                        offsetX = mouseX - imgX;
                        offsetY = mouseY - imgY;
                    }
                }

                public void mouseReleased(MouseEvent e) {
                    dragging = false;
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    if (dragging) {
                        imgX = e.getX() - offsetX;
                        imgY = e.getY() - offsetY;
                        repaint();
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, imgX, imgY, this);
        }
    }

    public static void main(String[] args) {
        new Code12_EX04();
    }
}
