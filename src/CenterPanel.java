import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    JPanel urlPanel, body, auth, query, header, docs;
    JComboBox requestBox;
    JButton sendButton;
    JTextField urlAddress;
    JTabbedPane tabbedPane;

    public CenterPanel() {
        urlPanel = new JPanel();
        urlPanel.setLayout(new BorderLayout());

        String requests[] = {"GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD"};
        requestBox = new JComboBox<>(requests);
        sendButton = new JButton("Send");
        urlAddress = new JTextField("https://api.myproduct.com/v1/users");

        urlPanel.add(requestBox, BorderLayout.WEST);
        urlPanel.add(urlAddress, BorderLayout.CENTER);
        urlPanel.add(sendButton, BorderLayout.EAST);

        body = new JPanel();
        auth = new JPanel();
        query = new JPanel();
        header = new JPanel();
        docs = new JPanel();
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 200, 200);
        tabbedPane.add("Body", body);
        tabbedPane.add("Auth", auth);
        tabbedPane.add("Query", query);
        tabbedPane.add("Header", header);
        tabbedPane.add("Docs", docs);

        this.setLayout(new BorderLayout());
        this.add(urlPanel, BorderLayout.NORTH);
        this.add(tabbedPane, BorderLayout.CENTER);
        setTheme();

    }

    public void setTheme() {
        this.setBackground(GUI.theme);
        urlPanel.setBackground(GUI.theme);
        body.setBackground(GUI.theme);
        auth.setBackground(GUI.theme);
        query.setBackground(GUI.theme);
        header.setBackground(GUI.theme);
        docs.setBackground(GUI.theme);
        requestBox.setBackground(GUI.theme);
        sendButton.setBackground(GUI.theme);
        urlAddress.setBackground(GUI.theme);
        tabbedPane.setBackground(GUI.theme);
    }
}

