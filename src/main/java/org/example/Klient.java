package org.example;

public class Klient extends User {
    private String pesel;

    public Klient(String FN, String LN, String pesel) {
        super(FN, LN);
        this.pesel = pesel;
    }

    public Klient(String FN, String LN) {
        super(FN, LN);
    }

    public Klient(String firstName, String lastName, String privince, String town, String postCode, String street, String houseNumber, String flatNumber, String phone, String email, String email_ver, String password, String created_at, String pesel) {
        super(firstName, lastName, privince, town, postCode, street, houseNumber, flatNumber, phone, email, email_ver, password, created_at);
        this.pesel = pesel;
    }
}
