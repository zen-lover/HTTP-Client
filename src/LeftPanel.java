import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class LeftPanel extends JPanel {

    public LeftPanel() {
        this.setLayout(new BorderLayout());
        String insomnia[]={"Insomnia","Aus","U.S.A","England","Newzealand"};
        JComboBox comboBox = new JComboBox<>(insomnia);
        this.add(comboBox , BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.add(panel, BorderLayout.CENTER);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 2));
        String environment[]={"No Environment"};
        JComboBox environmentComboBox = new JComboBox<>(environment);
        JButton cookiesButton = new JButton("Cookies");
        panel1.add(environmentComboBox);
        panel1.add(cookiesButton);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        JTextField filterText = new JTextField("Filter");
        String newRequest[]={"New Request", "New Folder"};
        JComboBox requestComboBox = new JComboBox<>(newRequest);
        panel2.add(filterText, BorderLayout.CENTER);
        panel2.add(requestComboBox, BorderLayout.EAST);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("New Request");
        JTree requestLists=new JTree(style);
        panel3.add(panel2, BorderLayout.NORTH);
        panel3.add(requestLists, BorderLayout.CENTER);

        panel.add(panel1);
        panel.add(panel3);

    }
}
