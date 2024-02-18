package org.eserciziSpring.as;

public class Articoli {

    String codiceArt;

    String descrizione;

    public Articoli(String codiceArt, String descrizione){
        this.codiceArt = codiceArt;
        this.descrizione = descrizione;
    }


    @DaCompletare(descrizione = "Bisogna fare qualcosa...", assegnataA = "Alfredo")
    public void method1() {

    }

    @DaCompletare(descrizione = "Bisogna fare qualcosa anche qui", assegnataA = "Andrea")
    public void method2() {

    }
}
