import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class GUI {
    public JFrame frame;
    public JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel rightPanel;
    private JMenuBar menuBar;
    public JSplitPane splitPane, splitPane1;

    public static final Color theme = Color.WHITE;
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 550;

    public GUI() {
        frame = new JFrame("HTTP Client");
        frame.setLayout(new BorderLayout());

        menuBar = new Menu();
        frame.add(menuBar, BorderLayout.NORTH);
        frame.setJMenuBar(menuBar);

        leftPanel = new LeftPanel();
        centerPanel = new CenterPanel();
        rightPanel = new RightPanel();
        frame.add(leftPanel);       // TODO: Is this extra?
        frame.add(centerPanel);
        frame.add(rightPanel);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, centerPanel);
        splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane, rightPanel);

        splitPane.setDividerLocation(WIDTH/4);
        splitPane1.setDividerLocation(WIDTH*7/12);

        frame.add(splitPane1, BorderLayout.CENTER);

        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTheme();
    }

    public void show() {
        frame.setVisible(true);
    }

    public void setTheme() {
        frame.setBackground(theme);
        leftPanel.setBackground(theme);
        centerPanel.setBackground(theme);
        rightPanel.setBackground(theme);
        splitPane.setBackground(theme);
        splitPane1.setBackground(theme);
        menuBar.setBackground(theme);
    }
}
