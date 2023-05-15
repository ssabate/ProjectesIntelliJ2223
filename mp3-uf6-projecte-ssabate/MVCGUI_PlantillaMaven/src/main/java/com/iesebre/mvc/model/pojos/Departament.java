package com.iesebre.mvc.model.pojos;

public class Departament {

    private long _1_id;

    public Departament(long _1_id, String _2_nom) {
        this._1_id = _1_id;
        this._2_nom = _2_nom;
    }

    public Departament(String _2_nom) {
        this._2_nom = _2_nom;
    }

    public Departament() {
    }

    private String _2_nom;

    public long get_1_id() {
        return _1_id;
    }

    public void set_1_id(long _1_id) {
        this._1_id = _1_id;
    }

    public String get_2_nom() {
        return _2_nom;
    }

    public void set_2_nom(String _2_nom) {
        this._2_nom = _2_nom;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "_1_id=" + _1_id +
                ", _2_nom='" + _2_nom + '\'' +
                '}';
    }
}
