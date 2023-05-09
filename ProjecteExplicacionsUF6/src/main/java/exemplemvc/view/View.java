package exemplemvc.view;

import javax.swing.*;

public class View extends JFrame{
    private JPanel panel;
    private JButton boto;
    private JLabel label;
    private JTable table1;
    private JTextField textField1;
    private JButton botoInsertar;

    public View(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }

    //Afegixo getters (i setters)


    public JButton getBoto() {
        return boto;
    }

    public JLabel getLabel() {
        return label;
    }

    public JTable getTable1() {
        return table1;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JButton getBotoInsertar() {
        return botoInsertar;
    }
}
