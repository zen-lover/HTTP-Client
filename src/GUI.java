import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel rightPanel;

    public GUI() {
        frame = new JFrame("HTTP Client");
        frame.setSize(1100, 550);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.darkGray);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }
}
