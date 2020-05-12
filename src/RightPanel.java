import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    private JPanel infoPanel;
    private JLabel status, runtime, volume;
    private JComboBox historyBox;
    private JPanel preview, header, cookie, timeLine;
    private JTabbedPane tabbedPane;

    public RightPanel() {
        infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout());
        status = new JLabel("200 OK");
        runtime = new JLabel("1.00 s");
        volume = new JLabel("100.0 KB");
        String history[] = {"A few minutes ago"};
        historyBox = new JComboBox<>(history);
        infoPanel.add(status);
        infoPanel.add(runtime);
        infoPanel.add(volume);
        infoPanel.add(historyBox);

        preview = new JPanel();
        header = new JPanel();
        cookie = new JPanel();
        timeLine = new JPanel();
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 200, 200);
        tabbedPane.add("Preview", preview);
        tabbedPane.add("Header", header);
        tabbedPane.add("Cookie", cookie);
        tabbedPane.add("TimeLine", timeLine);

        this.setLayout(new BorderLayout());
        this.add(infoPanel, BorderLayout.NORTH);
        this.add(tabbedPane, BorderLayout.CENTER);
        setTheme();
    }

    public void setTheme() {
        this.setBackground(GUI.theme);
        infoPanel.setBackground(GUI.theme);
        status.setBackground(GUI.theme);
        runtime.setBackground(GUI.theme);
        volume.setBackground(GUI.theme);
        historyBox.setBackground(GUI.theme);
        preview.setBackground(GUI.theme);
        header.setBackground(GUI.theme);
        cookie.setBackground(GUI.theme);
        timeLine.setBackground(GUI.theme);
    }
}