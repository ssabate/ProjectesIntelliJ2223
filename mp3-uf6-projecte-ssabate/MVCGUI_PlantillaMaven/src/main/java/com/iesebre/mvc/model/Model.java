/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesebre.mvc.model;

/**
 *
 * @author profe
 */
public class Model {

    private int numClics=0;

    public int getNumClics() {
        return numClics;
    }

    public void incNumClics() {
        this.numClics++;
    }
}
