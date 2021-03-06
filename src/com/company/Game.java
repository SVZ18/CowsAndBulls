package com.company;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {
    private static JLabel userLabel, userNameLabel, repeatPsLabel, accountLabel;
    private static JTextField userText, userNameText;
    private static JLabel passwordLabel;
    private static JLabel titleLabel;
    private static JPasswordField passwordText, repeatPsText;
    private static JButton button;
    private static JButton button2, button3, button4;
    private static JLabel success;
    private static Font titleFont = new Font("Times New Roman", Font.BOLD, 30);
    private static Font normalTitle = new Font("Times New Roman", Font.PLAIN, 25);

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        titleLabel = new JLabel("WELCOME TO COWS AND BULLS!");
        titleLabel.setBounds(150, 70, 600, 50);
        titleLabel.setFont(titleFont);
        panel.add(titleLabel);

        userLabel = new JLabel("User");
        userLabel.setBounds(150, 200, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(240, 200, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(150, 230, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(240, 230, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(150,280,80,25);
        button.addActionListener(new Game());
        panel.add(button);

        button2 = new JButton("Register");
        button2.setBounds(305, 280, 100, 25);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame3 = new JFrame();
                JPanel panel3 = new JPanel();
                frame3.setSize(600, 600);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.add(panel3);

                panel3.setLayout(null);

                accountLabel = new JLabel("Create your account");
                accountLabel.setBounds(100, 70, 600, 50);
                accountLabel.setFont(normalTitle);
                panel3.add(accountLabel);

                userNameLabel = new JLabel("Username");
                userNameLabel.setBounds(100, 200, 80, 25);
                panel3.add(userNameLabel);

                userNameText = new JTextField(20);
                userNameText.setBounds(240, 200, 165, 25);
                panel3.add(userNameText);

                passwordLabel = new JLabel("Password");
                passwordLabel.setBounds(100, 240, 80, 25);
                panel3.add(passwordLabel);

                passwordText = new JPasswordField();
                passwordText.setBounds(240, 240, 165, 25);
                panel3.add(passwordText);

                repeatPsLabel = new JLabel("Repeat password");
                repeatPsLabel.setBounds(100, 280, 100, 25);
                panel3.add(repeatPsLabel);

                repeatPsText = new JPasswordField();
                repeatPsText.setBounds(240, 280, 165, 25);
                panel3.add(repeatPsText);

                button4 = new JButton("Exit");
                button4.setBounds(100, 320, 100, 25);
                button4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                panel3.add(button4);

                frame3.setVisible(true);

            }
        });
        panel.add(button2);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if(user.equals("Sandija") && password.equals("Sandija123")) {

            JFrame frame2 = new JFrame();
            JPanel panel2 = new JPanel();
            frame2.setSize(600, 600);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.add(panel2);

            panel2.setLayout(null);

            success = new JLabel("Login successful.");
            success.setBounds(50, 150, 300, 25);
            panel2.add(success);

            button3 = new JButton("Start new game");
            button3.setBounds(50,200,200,25);
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  // How to add such action to this button so that player would get to the game
                  //  after clicking on Start new game?
                }
            });

            panel2.add(button3);

            button4 = new JButton("Exit");
            button4.setBounds(50, 250, 100, 25);
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            panel2.add(button4);

            frame2.setVisible(true);

        }

    }
}
