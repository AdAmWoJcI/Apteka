package org.example;

public class Klient extends User {
    private String numerRecepty;

    public Klient (String FN, String LN, String NR){
       super(FN,LN);
       this.numerRecepty = NR;
    }

    public Klient (String FN, String LN){
        super(FN,LN);
    }
}
