package Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDFiled = new JTextField();
    JPasswordField passWordField = new JPasswordField();
    JLabel useridLabel = new JLabel("User ID:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel success = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String,String>();

    Login(HashMap<String,String> logininfoOriginal) {
        logininfo = logininfoOriginal;
        
        useridLabel.setBounds(50, 100, 75, 25);
        passwordLabel.setBounds(50, 150, 75, 25);

        userIDFiled.setBounds(125, 100, 200, 25);
        passWordField.setBounds(125, 150, 200, 25);

        success.setBounds(125, 250, 250, 35);
        success.setFont(new Font(null, Font.BOLD, 25));

        button.setBounds(125, 200, 100, 25);
        button.setFocusable(false);
        button.setBackground(Color.GREEN);
        button.addActionListener(this);

        resetButton.setBounds(230, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.setBackground(Color.RED);
        resetButton.addActionListener(this);

        
        frame.add(success);
        frame.add(useridLabel);
        frame.add(passwordLabel);
        frame.add(userIDFiled);
        frame.add(passWordField);
        frame.add(button);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login");
        frame.setSize(500,400);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton) {
            userIDFiled.setText("");
            passWordField.setText("");
        }

        if(e.getSource() == button) {
            String userID = userIDFiled.getText();
            String password = String.valueOf(passWordField.getPassword());

            if(logininfo.containsKey(userID)) {
                if(logininfo.get(userID).equals(password)) {
                    success.setForeground(Color.GREEN);
                    success.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcome = new WelcomePage(userID);
                } else {
                    success.setForeground(Color.RED);
                    success.setText("Wrong Password");
                }
            } else {
                success.setForeground(Color.RED);
                success.setText("User not found");
            }
        }
    } 
}
