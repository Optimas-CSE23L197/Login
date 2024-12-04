package Login;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;


public class Home implements ActionListener {
    JFrame frame = new JFrame();
    JButton login = new JButton("Login");
    JButton register = new JButton("Register");
    JLabel label = new JLabel("Welcome to the Sampark Website");

    Home() {

        login.setBounds(100, 200, 100, 40);
        login.setFocusable(false);
        login.addActionListener(this);
        login.setBackground(Color.GREEN);

        register.setBounds(250, 200, 100, 40);
        register.setFocusable(false);
        register.addActionListener(this);
        register.setBackground(Color.GRAY);



        frame.add(login);
        frame.add(register);
        label.setBounds(100, 50, 300, 100);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        frame.setTitle("Home");
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Home home = new Home();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login) {
            IdPassword idPassword = new IdPassword();
            Login login = new Login(idPassword.getLogininfo());
            frame.dispose();
        }
    }
}
