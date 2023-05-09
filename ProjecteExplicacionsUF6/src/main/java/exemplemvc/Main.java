package exemplemvc;

import exemplemvc.controller.Controller;
import exemplemvc.model.Model;
import exemplemvc.model.Pojo;
import exemplemvc.view.View;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Controller(new Pojo(), new View(), new Model());

            }
        });
    }
}
