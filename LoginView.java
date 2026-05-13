package view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    public JTextField tfUsername = new JTextField();
    public JPasswordField pfPassword = new JPasswordField();
    public JButton btnLogin = new JButton("Login");

    public LoginView() {

        setTitle("Login");
        setSize(350, 200);
        setLayout(new GridLayout(3,2,10,10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JLabel("Username"));
        add(tfUsername);

        add(new JLabel("Password"));
        add(pfPassword);

        add(new JLabel());
        add(btnLogin);

        setVisible(true);
    }
}