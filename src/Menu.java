import javax.swing.*;
import javax.swing.text.html.HTML;
import java.awt.*;
import java.awt.event.*;

import static java.lang.System.exit;


public class Menu extends JMenuBar {
    JMenu application, view, help;
    JMenuItem options, exit, toggleFullScreen, toggleSidebar, about, helpItem;

    public Menu() {


        application = new JMenu("Application");
        application.setMnemonic(KeyEvent.VK_A);
        options = new JMenuItem("Options", KeyEvent.VK_O);
        options.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        options.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                optionsMethod();
            }
        });
        exit = new JMenuItem("Exit", KeyEvent.VK_X);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        exit.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       exit(0);
                                   }
                               });
        application.add(options);
        application.add(exit);


        view = new JMenu("View");
        application.setMnemonic(KeyEvent.VK_V);
        toggleFullScreen = new JMenuItem("Toggle Full Screen", KeyEvent.VK_F);
        toggleFullScreen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        toggleFullScreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame myFrame = Main.HTTPClientGUI.frame;
                if (myFrame.getWidth() == GUI.WIDTH && myFrame.getHeight() == GUI.HEIGHT){
                    myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }else{
                    myFrame.setSize(GUI.WIDTH, GUI.HEIGHT);
                    myFrame.setLocationRelativeTo(null);
                }

            }
        });
        toggleSidebar = new JMenuItem("Toggle Sidebar");
        toggleSidebar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        toggleSidebar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.HTTPClientGUI.leftPanel.isVisible()) {
                    Main.HTTPClientGUI.leftPanel.setVisible(false);
                } else {
                    Main.HTTPClientGUI.leftPanel.setVisible(true);
                    Main.HTTPClientGUI.splitPane.setDividerLocation(WIDTH/4);
                }
            }
        });
        view.add(toggleFullScreen);
        view.add(toggleSidebar);


        help = new JMenu("Help");
        application.setMnemonic(KeyEvent.VK_H);
        about = new JMenuItem("About");
        about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        Main.HTTPClientGUI.frame,
                        "Hello, welcome to my HTTP CLIENT application.\n" +
                                "Email: m.mahdisaeedi99@gmail.com\n" +
                                "ID: 9723036",
                        "About",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        helpItem = new JMenuItem("Help");
        helpItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, ActionEvent.SHIFT_MASK));
        helpItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        Main.HTTPClientGUI.frame,
                        "Shortcut:\n\n" +
                                "ctrl+N : new request\n" +
                                "ctrl+X : exit",
                        "Help",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        help.add(about);
        help.add(helpItem);

        this.add(application);
        this.add(view);
        this.add(help);
    }

    public void optionsMethod() {
        JFrame optionFrame = new JFrame("Options");
        optionFrame.setLayout(new GridLayout(3, 1));

        JCheckBox followRedirect = new JCheckBox("Follow redirect");
        followRedirect.setBounds(50,20, 150,50);
        JCheckBox exitState = new JCheckBox("Hide on system tray", true);
        exitState.setBounds(50,70, 150,50);

        DefaultListModel<String> theme = new DefaultListModel<>();
        theme.addElement("dark theme");
        theme.addElement("light theme");
        JList<String> list = new JList<>(theme);
        list.setBounds(50,120, 100,50);

        optionFrame.add(followRedirect);
        optionFrame.add(exitState);
        optionFrame.add(list);
        optionFrame.setSize(300,200);
        optionFrame.setLayout(null);
        optionFrame.setVisible(true);
        optionFrame.setLocationRelativeTo(Main.HTTPClientGUI.frame);
    }
}