package com.iesebre.codifont.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TriaDir extends JFrame {

    JPanel panel;
    private JButton button1;
    private JTextArea textArea1;
    private JTextField textField1;
    final JFileChooser fc = new JFileChooser();

    public TriaDir(){

        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        this.panel.setSize(2040,690);
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                switch(fc.showOpenDialog(null)){
                    case JFileChooser.APPROVE_OPTION:
                        textField1.setText(fc.getSelectedFile().toString());

                        try {
                            BufferedReader br=new BufferedReader(new FileReader(fc.getSelectedFile()));
                            String s;
                            while((s=br.readLine())!=null){
                                textArea1.setText(textArea1.getText()+s+"\n");
                            }
                            br.close();
                        } catch (FileNotFoundException e) {
                            JOptionPane.showMessageDialog(null,
                                    "Error llegint fitxer!!", "Error",
                                    JOptionPane.ERROR_MESSAGE);

                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null,
                                    "Error tancant fitxer!!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case JFileChooser.CANCEL_OPTION:
                        JOptionPane.showMessageDialog(null,
                                "Acció cancelada!!", "Error", JOptionPane.CANCEL_OPTION);


                }
            }
        });
    }
}
