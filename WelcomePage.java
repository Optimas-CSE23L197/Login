package Login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String userID) {

        welcomeLabel.setText("Welcome " + userID);
        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 15));

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(userID + "'s Account");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
