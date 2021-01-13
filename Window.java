package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JTextField field;
    private final JTextArea area;
    private JButton button;

    public Window() {
        setTitle("chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        area = new JTextArea();
        area.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(area);
        panel.add(scroll, BorderLayout.CENTER);

        JPanel buttonJp = new JPanel();
        buttonJp.setLayout(new BorderLayout());

        addTextField();
        buttonJp.add(field, BorderLayout.CENTER);

        addButton();
        buttonJp.add(button, BorderLayout.SOUTH);
        panel.add(buttonJp, BorderLayout.SOUTH);
        add(panel);

        setVisible(true);
        field.grabFocus();
    }

    private void sendMessage() {
        if (!field.getText().isEmpty()) {
            area.append(field.getText() + "\n");
            field.setText(" ");
            field.grabFocus();
        }
    }

    private void addButton() {
        button = new JButton("отправить");
        button.addActionListener(e -> sendMessage());
    }

    private void addTextField() {
        field = new JTextField();
        field.addActionListener(e -> sendMessage());

    }
}
