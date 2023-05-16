/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesebre.mvc.mvcgui;

import com.iesebre.mvc.controller.Controller;
import com.iesebre.mvc.model.Model;
import com.iesebre.mvc.model.excepcions.ExcepcioDAO;
import com.iesebre.mvc.model.implementacions.DeptOracle;
import com.iesebre.mvc.model.pojos.Departament;
import com.iesebre.mvc.view.View;

import javax.swing.*;

/**
 *
 * @author profe
 */
public class MVCGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (ExcepcioDAO e) {
                    JOptionPane.showMessageDialog(null,e.getMessage());
                    System.exit(1);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        new Controller(new Model(),new View(), new DeptOracle());
    }
}
