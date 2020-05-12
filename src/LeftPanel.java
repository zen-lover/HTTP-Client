import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.lang.reflect.Field;

public class LeftPanel extends JPanel {

    private JComboBox comboBox, environmentComboBox, requestComboBox;
    private JPanel panel, panel1, panel2, panel3;
    private JButton cookiesButton;
    private JTextField filterText;
    private JTree requestLists;

    public LeftPanel() {
        this.setLayout(new BorderLayout());
        String insomnia[] = {"Insomnia"};
        comboBox = new JComboBox<>(insomnia);
        this.add(comboBox, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.add(panel, BorderLayout.CENTER);

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 2));
        String environment[] = {"No Environment"};
        environmentComboBox = new JComboBox<>(environment);
        cookiesButton = new JButton("Cookies");
        panel1.add(environmentComboBox);
        panel1.add(cookiesButton);

        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        filterText = new JTextField("Filter");
        String newRequest[] = {"New Request", "New Folder"};
        requestComboBox = new JComboBox<>(newRequest);
        panel2.add(filterText, BorderLayout.CENTER);
        panel2.add(requestComboBox, BorderLayout.EAST);

        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("New Request");
        requestLists = new JTree(style);
        panel3.add(panel2, BorderLayout.NORTH);
        panel3.add(requestLists, BorderLayout.CENTER);

        panel.add(panel1);
        panel.add(panel3);
        setTheme();

    }

    public void setTheme() {
        this.setBackground(GUI.theme);
        comboBox.setBackground(GUI.theme);
        environmentComboBox.setBackground(GUI.theme);
        requestComboBox.setBackground(GUI.theme);
        panel.setBackground(GUI.theme);
        panel1.setBackground(GUI.theme);
        panel2.setBackground(GUI.theme);
        panel3.setBackground(GUI.theme);
        cookiesButton.setBackground(GUI.theme);
        filterText.setBackground(GUI.theme);
        requestLists.setBackground(GUI.theme);
    }
}

