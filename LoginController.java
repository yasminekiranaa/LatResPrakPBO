package controller;

import dao.UserDAO;
import javax.swing.JOptionPane;
import view.LoginView;
import view.MenuView;

public class LoginController {

    private LoginView view;
    private UserDAO dao;

    public LoginController(LoginView view) {
        this.view = view;
        dao = new UserDAO();

        this.view.btnLogin.addActionListener(e -> login());
    }

    private void login() {

        String username = view.tfUsername.getText();
        String password = String.valueOf(view.pfPassword.getPassword());

        if(username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(view,
                "Field tidak boleh kosong!");
            return;
        }

        boolean cek = dao.login(username, password);

        if(cek) {
            JOptionPane.showMessageDialog(view,
                "Login Berhasil");

            new MenuView(username);
            view.dispose();

        } else {
            JOptionPane.showMessageDialog(view,
                "Username / Password Salah");
        }
    }
}