package com.iesebre.codifont;

import com.iesebre.codifont.view.TriaDir;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TriaDir();
            }
        });
    }
}
