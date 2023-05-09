package persistence.javabeans;

import jakarta.persistence.*;

import java.beans.*;
import java.io.Serializable;
import java.util.List;

public class JavaBeansJPA<T> implements Serializable, VetoableChangeListener {


    //Propietats per treballar en la BD
    private String persistenceUnitName;

    private static EntityManagerFactory emf;    // El indispensable entity factory. Li passem el nom de la unitat de
                                                // persistència al constructor. EL nom ha de coincidir en l'establert al
                                                // fitxer persistence.xml

    //Strings associats a les propietats lligades/restringides

    //Propietats a lligar/restringir

    //Codi per poder lligar i restringir propietats (JavaBeansBDR)
    private PropertyChangeSupport pcs;

    private VetoableChangeSupport vcs;

    //El constructor buit el faig private per obligar a passar el Unit Persistence Name
    private JavaBeansJPA() {

        this.pcs = new PropertyChangeSupport(this);
        this.vcs = new VetoableChangeSupport(this);
        //Ell mateix restringix les seues propietats
        this.addVetoableChangeListener(this);
    }

    public JavaBeansJPA(String persistenceUnitName) {
        this();
        this.persistenceUnitName = persistenceUnitName;
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vcs.removeVetoableChangeListener(listener);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    //Codi per restringir propietats (implements VetoableChangeListener)
    @Override
    public void vetoableChange(PropertyChangeEvent propertyChangeEvent) throws PropertyVetoException {
        JavaBeansJPA source = (JavaBeansJPA) propertyChangeEvent.getSource();
    }

    //Getters i setters de props no lligades/restringides

}

