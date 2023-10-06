package com.login;

import com.diary.Diary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panel1;
    private JTextField userTxtF;
    private JPasswordField passwordTxtF;
    private JButton loginBtn;
    private JButton registerBtn;
    private JLabel passwordLabel;
    private JLabel userLabel;
    private JLabel loginLabel;
    private JLabel msgLabel;
    private JButton backBtn;
    private JButton register2Btn;
    private String userName;
    private String password;

    public Login() {
        // Put the main panel of the interface
        setContentPane(panel1);

        // Put the default window options
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Put a title to the window
        setTitle("Mi diario");

        // Adjust size
        setSize(500, 400);

        // Locks size
        setResizable(false);

        // Put in the middle of the screen
        setLocationRelativeTo(null);

        // Show the window
        setVisible(true);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userName != null && password != null) {
                    if (userTxtF.getText().equals(userName) && passwordTxtF.getText().equals(password)) {
                        msgLabel.setText("Los datos ingresados son correctos");

                        Diary diary = new Diary();

                        panel1.setVisible(false);
                    } else {
                        userTxtF.setText("");
                        passwordTxtF.setText("");
                        msgLabel.setText("Los datos ingresados no son correctos");
                    }
                } else {
                    userTxtF.setText("");
                    passwordTxtF.setText("");
                    msgLabel.setText("Los datos ingresados no coinciden con ningún usuario");
                }
            }
        });

        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginLabel.setText("Registro");
                msgLabel.setText("");
                userTxtF.setText("");
                passwordTxtF.setText("");
                loginBtn.setVisible(false);
                loginBtn.setEnabled(false);
                registerBtn.setVisible(false);
                registerBtn.setEnabled(false);
                register2Btn.setVisible(true);
                register2Btn.setEnabled(true);
                backBtn.setVisible(true);
                backBtn.setEnabled(true);
            }
        });

        register2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userTxtF.getText().equals("") || passwordTxtF.getText().equals("")) {
                    msgLabel.setText("Hacen falta de llenar campos");
                } else {
                    setUserName(userTxtF.getText());
                    setPassword(passwordTxtF.getText());

                    backBtn.doClick();
                }
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginLabel.setText("Iniciar Sesión");
                msgLabel.setText("");
                userTxtF.setText("");
                passwordTxtF.setText("");
                loginBtn.setVisible(true);
                loginBtn.setEnabled(true);
                registerBtn.setVisible(true);
                registerBtn.setEnabled(true);
                register2Btn.setVisible(false);
                register2Btn.setEnabled(false);
                backBtn.setVisible(false);
                backBtn.setEnabled(false);
            }
        });
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
