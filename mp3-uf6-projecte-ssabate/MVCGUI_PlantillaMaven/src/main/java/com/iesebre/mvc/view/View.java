package com.iesebre.mvc.view;

import javax.swing.*;

public class View extends JFrame {
    private JPanel panel;
    private JButton button1;
    private JTable table1;
    private JTextField campId;
    private JTextField campNom;

    public View(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public JTable getTable1() {
        return table1;
    }

    public JButton getButton1() {
        return button1;
    }

    public JTextField getCampId() {
        return campId;
    }

    public JTextField getCampNom() {
        return campNom;
    }
}
