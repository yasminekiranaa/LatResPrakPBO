package view;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame {

    public MenuView(String username) {

        setTitle("Menu");
        setSize(400,300);
        setLayout(new GridLayout(4,1,10,10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel(
            "Selamat Datang, " + username + "!",
            SwingConstants.CENTER
        );

        JButton btnLogout = new JButton("Logout");

        add(label);
        add(new JButton("Data Kendaraan"));
        add(new JButton("Data Sopir"));
        add(btnLogout);

        btnLogout.addActionListener(e -> {
            new LoginView();
            dispose();
        });

        setVisible(true);
    }
}