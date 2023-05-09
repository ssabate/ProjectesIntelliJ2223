package view;

import javax.swing.*;

public class View2021  extends javax.swing.JFrame {
    private JTextField textField1;
    private JPanel panel;

    public View2021(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public JTextField getTextField1() {
        return textField1;
    }
}
