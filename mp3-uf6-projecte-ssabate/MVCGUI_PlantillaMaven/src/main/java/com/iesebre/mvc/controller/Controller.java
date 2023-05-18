/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesebre.mvc.controller;

import com.iesebre.mvc.model.Model;
import com.iesebre.mvc.model.excepcions.ExcepcioDAO;
import com.iesebre.mvc.model.implementacions.DeptOracle;
import com.iesebre.mvc.model.pojos.Departament;
import com.iesebre.mvc.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.iesebre.dam1.mvclibrary.utilscontroller.Utils.loadTable;

/**
 *
 * @author profe
 */
public class Controller {
    
    private static Model modelVell;

    private static DeptOracle model;
    private static View view;
    
    public Controller(Model m, View v, DeptOracle model) throws ExcepcioDAO {
        modelVell =m;
        view=v;
        this. model=model;
        controlador();
    }
    
    private void controlador() throws ExcepcioDAO {
        
        //Codi que inicilitza la vista
        //com.iesebre.mvc.view.setVisible(true);
        loadTable(model.getAll(), view.getTable1(), Departament.class);
        
        //Codi que assigna els listeners als components de la vista --> botó insertar
        view.getButton1().addActionListener(
                (ActionEvent a)->{

                    try {
                        model.save(new Departament(Integer.valueOf(view.getCampId().getText()), view.getCampNom().getText()));
                        loadTable(model.getAll(), view.getTable1(), Departament.class);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(view,"Has de posar un número correcte al com id!!");
                    }
                    catch (ExcepcioDAO e) {
                        throw new RuntimeException(e);
                    }

                }
        );
    }
    
    //Per implementar els ActionEvents dels components de la vista (útil per 
    //exemple, per controlar l'acció que s'executa quan fem clic a un botó tant 
    //usant el ratolí com si l'apretem en la barra del teclat  
    static class Action implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    //Per implementar els KeyEvents
    //També podem usar un KeyAdapter
    //static class Key extends KeyAdapter{}
    static class Key implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {


        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    
    
    //Podem posar tots els listeners necessaris...
}
