import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.filechooser.*;

public class gimal extends JFrame {
    private JFileChooser chooser;
    private Color currentColor = Color.BLACK;
    private String currentShape = "사각형";
    private DrawPanel drawPanel;

    public gimal() {
        setTitle("기말고사 과제");
        createMenu();
        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        MenuActionListener menulistener = new MenuActionListener();
        OptionActionListener optionlistener = new OptionActionListener();

        JMenu menu = new JMenu("메뉴");
        String[] itemTitles = {"불러오기", "저장하기", "나가기"};
        for (String title : itemTitles) {
            JMenuItem item = new JMenuItem(title);
            item.addActionListener(menulistener);
            menu.add(item);
        }
        mb.add(menu);

        JMenu option = new JMenu("옵션");
        String[] optionTitles = {"사각형", "원", "직선"};
        for (String title : optionTitles) {
            JMenuItem item = new JMenuItem(title);
            item.addActionListener(optionlistener);
            option.add(item);
        }
        mb.add(option);

        JMenu menuColor = new JMenu("컬러");
        JMenuItem colorMenuItem = new JMenuItem("색상선택");
        colorMenuItem.addActionListener(e -> {
            Color selected = JColorChooser.showDialog(null, "색상 선택", currentColor);
            if (selected != null) {
                currentColor = selected;
                drawPanel.setCurrentColor(currentColor);
            }
        });
        menuColor.add(colorMenuItem);
        mb.add(menuColor);

        setJMenuBar(mb);
    }

    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch (cmd) {
                case "불러오기":
                    chooser = new JFileChooser();
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트 파일", "txt");
                    chooser.setFileFilter(filter);
                    int load = chooser.showOpenDialog(gimal.this); // 정수값 반환
                    if (load == JFileChooser.APPROVE_OPTION) {
                        File file = chooser.getSelectedFile();
                        drawPanel.loadShapesFromFile(file);
                    }
                    break;
                case "저장하기":
                    chooser = new JFileChooser();
                    int save = chooser.showSaveDialog(gimal.this); //정수값 반환함
                    if (save == JFileChooser.APPROVE_OPTION) {
                        File saveFile = chooser.getSelectedFile();
                        drawPanel.saveShapesToFile(saveFile);
                    }
                    break;
                case "나가기":
                    System.exit(0);
                    break;
            }
        }
    }

    class OptionActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            currentShape = e.getActionCommand();
            drawPanel.setCurrentShape(currentShape);
        }
    }

    // -------- 도형 정보 --------

    interface MyShape {
        void draw(Graphics g);
        String toText();
    }

    class MyRectangle implements MyShape {
        int x1, y1, x2, y2;
        Color color;

        public MyRectangle(int x1, int y1, int x2, int y2, Color color) {
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
            this.color = color;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1)); // 자바는 4사분면 개념이 X
        }

        public String toText() {
            return String.format("사각형,%d,%d,%d,%d,%d,%d,%d",
                    x1, y1, x2, y2, color.getRed(), color.getGreen(), color.getBlue());
        }
    }

    class MyOval implements MyShape {
        int x1, y1, x2, y2;
        Color color;

        public MyOval(int x1, int y1, int x2, int y2, Color color) {
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
            this.color = color;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
        }

        public String toText() {
            return String.format("원,%d,%d,%d,%d,%d,%d,%d",
                    x1, y1, x2, y2, color.getRed(), color.getGreen(), color.getBlue());
        }
    }

    class MyLine implements MyShape {
        int x1, y1, x2, y2;
        Color color;

        public MyLine(int x1, int y1, int x2, int y2, Color color) {
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
            this.color = color;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.drawLine(x1, y1, x2, y2);
        }

        public String toText() {
            return String.format("직선,%d,%d,%d,%d,%d,%d,%d",
                    x1, y1, x2, y2, color.getRed(), color.getGreen(), color.getBlue());
        }
    }

    // -------- 그림 그리는 패널 --------

    class DrawPanel extends JPanel {
        private java.util.List<MyShape> shapes = new ArrayList<>();
        private String shapeType = "사각형";
        private Color color = Color.BLUE;
        private int x1, y1, x2, y2;
        
        public DrawPanel() {
            MyMouseListener listener = new MyMouseListener();
            addMouseListener(listener);
            addMouseMotionListener(listener);
        }

        public void setCurrentShape(String shapeType) {
            this.shapeType = shapeType;
        }

        public void setCurrentColor(Color color) {
            this.color = color;
        }

        class MyMouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
            
            public void mouseDragged(MouseEvent e) { //드래그 해결 안됨
            	
            	x2 = e.getX();
                y2 = e.getY();
                repaint();
            }
            
            
            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();

                switch (shapeType) {
                case "사각형":
                    shapes.add(new MyRectangle(x1, y1, x2, y2, color));
                    break;
                case "원":
                    shapes.add(new MyOval(x1, y1, x2, y2, color));
                    break;
                case "직선":
                    shapes.add(new MyLine(x1, y1, x2, y2, color));
                    break;
            }
                

                repaint();
            }
            
        }
        
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (MyShape shape : shapes) {
                shape.draw(g);
            }
        }

        public void saveShapesToFile(File file) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (MyShape shape : shapes) {
                    writer.write(shape.toText());
                    writer.newLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "저장 실패: " + e.getMessage());
            }
        }

        public void loadShapesFromFile(File file) {
            shapes.clear();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");

                    String type = parts[0];
                    int x1 = Integer.parseInt(parts[1]);
                    int y1 = Integer.parseInt(parts[2]);
                    int x2 = Integer.parseInt(parts[3]);
                    int y2 = Integer.parseInt(parts[4]);
                    int r = Integer.parseInt(parts[5]);
                    int g = Integer.parseInt(parts[6]);
                    int b = Integer.parseInt(parts[7]);
                    Color color = new Color(r, g, b);

                    switch (type) {
                        case "사각형":
                            shapes.add(new MyRectangle(x1, y1, x2, y2, color));
                            break;
                        case "원":
                            shapes.add(new MyOval(x1, y1, x2, y2, color));
                            break;
                        case "직선":
                            shapes.add(new MyLine(x1, y1, x2, y2, color));
                            break;
                    }
                }
                repaint();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "불러오기 실패: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new gimal();
    }
}
