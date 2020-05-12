import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class GUI {
    private JFrame frame;
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel rightPanel;

    public static final int WIDTH = 1100;
    public static final int HEIGHT = 550;

    public GUI() {
        frame = new JFrame("HTTP Client");
        frame.setLayout(new BorderLayout());

        leftPanel = new LeftPanel();
        centerPanel = new CenterPanel();
        rightPanel = new RightPanel();
        frame.add(leftPanel);
        frame.add(centerPanel);
        frame.add(rightPanel);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, centerPanel);
        JSplitPane splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane, rightPanel);

        splitPane.setDividerLocation(WIDTH/4);
        splitPane1.setDividerLocation(WIDTH*7/12);

        frame.add(splitPane1, BorderLayout.CENTER);

        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }
}
