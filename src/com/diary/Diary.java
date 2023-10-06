package com.diary;

import javax.swing.*;

public class Diary extends JFrame{
    private JPanel panel1;
    private JTable table1;
    private JTextArea noteTxtArea;
    private JButton noteBtn;
    private JTextField searchTxt;
    private JButton searchBtn;
    private JLabel titleLabel;
    private JLabel searchLabel;
    private JLabel noteLabel;
    private JButton exitBtn;

    public Diary() {
        // Put the main panel of the interface
        setContentPane(panel1);

        // Put the default window options
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Put a title to the window
        setTitle("Mi diario");

        // Adjust size
        setSize(800, 500);

        // Locks size
        setResizable(false);

        // Put in the middle of the screen
        setLocationRelativeTo(null);

        // Show the window
        setVisible(true);
    }
}
