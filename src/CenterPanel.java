import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    public CenterPanel() {
        JPanel urlPanel = new JPanel();
        urlPanel.setLayout(new BorderLayout());

        String requests[]={"GET","POST","PUT","PATCH","DELETE","OPTIONS","HEAD"};
        JComboBox requestBox = new JComboBox<>(requests);
        JButton sendButton = new JButton("Send");
        JTextField urlAddress = new JTextField("https://api.myproduct.com/v1/users");

        urlPanel.add(requestBox, BorderLayout.WEST);
        urlPanel.add(urlAddress, BorderLayout.CENTER);
        urlPanel.add(sendButton, BorderLayout.EAST);

        JPanel body=new JPanel();
        JPanel auth=new JPanel();
        JPanel query=new JPanel();
        JPanel header=new JPanel();
        JPanel docs=new JPanel();
        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.setBounds(50,50,200,200);
        tabbedPane.add("Body",body);
        tabbedPane.add("Auth",auth);
        tabbedPane.add("Query",query);
        tabbedPane.add("Header",header);
        tabbedPane.add("Docs",docs);

        this.setLayout(new BorderLayout());
        this.add(urlPanel, BorderLayout.NORTH);
        this.add(tabbedPane, BorderLayout.CENTER);


    }
}

