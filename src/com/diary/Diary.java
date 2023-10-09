package com.diary;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Diary extends JFrame{
    private JPanel panel1;
    private JTable table1;
    private JTextArea noteTxtArea;
    private JButton noteBtn;
    private JTextField searchTxt;
    private JButton searchBtn;
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

        noteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultTableModel model = new DefaultTableModel(1, 0);

                model.addRow(new Object[]{noteTxtArea.getText()});

                table1.setModel(model);
            }
        });

        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
    }
}
