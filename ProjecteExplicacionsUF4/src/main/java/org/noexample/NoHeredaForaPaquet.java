package org.noexample;

import org.example.Herencia;

public class NoHeredaForaPaquet {

    public static void main(String[] args) {

        Herencia h =new Herencia();
        h.propietat1=90;
    }

}

class FillaForaPaquet extends Herencia{

    public FillaForaPaquet(){
        this.propietat1=89;
        this.propietat3=9;

    }

}
