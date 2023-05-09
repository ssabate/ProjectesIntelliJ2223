package view;

import javax.swing.*;

public class View extends JFrame {
    private JPanel panel;
    private JButton button1;

    public View(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public JButton getButton1() {
        return button1;
    }
}
