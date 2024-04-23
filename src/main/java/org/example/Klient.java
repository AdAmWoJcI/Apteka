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

    public Klient(String firstName, String lastName, String privince, String town, String postCode, String street, String houseNumber, String flatNumber, String phone, String email, String email_ver, String password, String created_at, String numerRecepty) {
        super(firstName, lastName, privince, town, postCode, street, houseNumber, flatNumber, phone, email, email_ver, password, created_at);
        this.numerRecepty = numerRecepty;
    }
}
