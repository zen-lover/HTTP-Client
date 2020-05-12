import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    public RightPanel() {
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout());
        JLabel status = new JLabel("200 OK");
        JLabel runtime = new JLabel("1.00 s");
        JLabel volume = new JLabel("100.0 KB");
        String history[]={"A few minutes ago"};
        JComboBox historyBox = new JComboBox<>(history);
        infoPanel.add(status);
        infoPanel.add(runtime);
        infoPanel.add(volume);
        infoPanel.add(historyBox);

        JPanel preview = new JPanel();
        JPanel header = new JPanel();
        JPanel cookie = new JPanel();
        JPanel timeLine = new JPanel();
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 200, 200);
        tabbedPane.add("Preview", preview);
        tabbedPane.add("Header", header);
        tabbedPane.add("Cookie", cookie);
        tabbedPane.add("TimeLine", timeLine);

        this.setLayout(new BorderLayout());
        this.add(infoPanel, BorderLayout.NORTH);
        this.add(tabbedPane, BorderLayout.CENTER);
    }
}