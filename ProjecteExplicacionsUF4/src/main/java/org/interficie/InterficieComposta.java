package org.interficie;

public interface InterficieComposta extends Interficie1, Interficie2{

    void fesAlgo();
}

interface InterficieCompostaMillorada extends InterficieComposta{

    void fesAlgoMesIMillor();

}


interface Interficie1{

    void fesAlgo1();

}

interface Interficie2 {

    void fesAlgo2();

}


class Implementa implements InterficieCompostaMillorada{

    public void fesAlgo(){

    }
    @Override
    public void fesAlgo1() {

    }

    @Override
    public void fesAlgo2() {

    }

    @Override
    public void fesAlgoMesIMillor() {

    }
}