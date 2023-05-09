package exemplemvc.controller;

import exemplemvc.model.Model;
import exemplemvc.model.Pojo;
import exemplemvc.view.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class Controller {

    private Pojo m;
    private Model model;

    private View v;

    public Controller(Pojo m, View v, Model model){
        this.m=m;
        this.v=v;
        this.model=model;
        controlar();
    }

    private void controlar() {
        //Aquí posarem la lògica de l'aplicació

        //DefaultTableModel dtm=(DefaultTableModel)v.getTable1().getModel();
        DefaultTableModel dtm= new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"Valor"});
        v.getTable1().setModel(dtm);

        //Codi del botó que compta els clics
        v.getBoto().addActionListener(
                (ActionEvent a) ->{
                    //Modifico les dades de l'aplicació --> incremento el número de clics
                    m.setNumClics(m.getNumClics()+1);

                    //Modifico la vista --> poso el número de vegades que ehm clicat al label
                    v.getLabel().setText("Has apretat el botó "+m.getNumClics()+" vegades!");
                }
        );

        //Codi del botó que inserta a la taula
        v.getBotoInsertar().addActionListener(
                (ActionEvent a)->{
                    try {
                        //Intentem insertar un nou obejecte pojo a la taula
                        model.getDades()[model.getIndex()] = new Pojo(Integer.valueOf(v.getTextField1().getText()));

                        //Mostrem el valor a la taula
                        dtm.addRow(new Object[]{model.getDades()[model.getIndex()].getNumClics()});

                        //Si hem pogut insertar incrementem l'índex del vector
                        model.setIndex(model.getIndex()+1);
                    }catch(ArrayIndexOutOfBoundsException e){
                        JOptionPane.showMessageDialog(null, "No caben més elements a la taula!!");
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "El contingut del camp no és un enter vàlid!!");
                    }
                }
        );


    }

}
