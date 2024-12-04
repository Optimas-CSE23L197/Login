package Login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame();
    JButton dashButton = new JButton("Dashboard");
    JButton profileButton = new JButton("Profile");
    JButton projecButton = new JButton("Projects");
    JButton inventoryButton = new JButton("Inventory");
    JButton settingsButton = new JButton("Settings");
    JButton logoutButton = new JButton("Logout");
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String userID) {

        dashButton.setBounds(100, 100, 200, 35);
        dashButton.setFocusable(false);
        dashButton.addActionListener(this);

        profileButton.setBounds(100, 150, 200, 35);
        profileButton.setFocusable(false);
        profileButton.addActionListener(this);

        projecButton.setBounds(100, 200, 200, 35);
        projecButton.setFocusable(false);
        projecButton.addActionListener(this);

        inventoryButton.setBounds(100, 250, 200, 35);
        inventoryButton.setFocusable(false);
        inventoryButton.addActionListener(this);

        settingsButton.setBounds(100, 300, 200, 35);
        settingsButton.setFocusable(false);
        settingsButton.addActionListener(this);

        logoutButton.setBounds(100, 350, 200, 35);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);

        welcomeLabel.setText("Welcome " + userID);
        welcomeLabel.setBounds(120, 30, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 15));

        frame.add(welcomeLabel);
        frame.add(dashButton);
        frame.add(profileButton);
        frame.add(projecButton);
        frame.add(inventoryButton);
        frame.add(settingsButton);
        frame.add(logoutButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(userID + "'s Account");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logoutButton) {
            frame.dispose();
            Home home = new Home();
        }
    }
}
