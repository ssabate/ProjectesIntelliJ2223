package exemplenomvc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalUserInterface extends JFrame {
    private JButton boto;
    private JLabel label;
    private JPanel panel;

    //Dades de l'aplicació
    private int numClics=0;

    //Constructor de la classe
    public GraphicalUserInterface(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);

        boto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numClics++;
                label.setText("Has apretat el botó "+numClics+" vegades");
            }
        });
    }

    public static void main(String[] args) {
        new GraphicalUserInterface();
    }
}
