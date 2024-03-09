package org.example;

public class Apteka {
        private String Kraj;
        private String Woj;
        private String Miasto;
        private String Ulica;
        private String Budynek;
        private String Lokal;
        private String KodPoczt;
        private String NumerTel;

    public String getKraj() {
        return Kraj;
    }

    public void setKraj(String kraj) {
        Kraj = kraj;
    }

    public String getWoj() {
        return Woj;
    }

    public void setWoj(String woj) {
        Woj = woj;
    }

    public String getMiasto() {
        return Miasto;
    }

    public void setMiasto(String miasto) {
        Miasto = miasto;
    }

    public String getUlica() {
        return Ulica;
    }

    public void setUlica(String ulica) {
        Ulica = ulica;
    }

    public String getBudynek() {
        return Budynek;
    }

    public void setBudynek(String budynek) {
        Budynek = budynek;
    }

    public String getLokal() {
        return Lokal;
    }

    public void setLokal(String lokal) {
        Lokal = lokal;
    }

    public String getKodPoczt() {
        return KodPoczt;
    }

    public void setKodPoczt(String kodPoczt) {
        KodPoczt = kodPoczt;
    }

    public String getNumerTel() {
        return NumerTel;
    }

    public void setNumerTel(String numerTel) {
        NumerTel = numerTel;
    }

    public Apteka(String kraj, String woj, String miasto, String ulica, String budynek, String lokal, String kodPoczt, String numerTel) {
        Kraj = kraj;
        Woj = woj;
        Miasto = miasto;
        Ulica = ulica;
        Budynek = budynek;
        Lokal = lokal;
        KodPoczt = kodPoczt;
        NumerTel = numerTel;
    }

    public Apteka(String kraj, String woj, String miasto, String ulica, String budynek, String kodPoczt, String numerTel) {
        Kraj = kraj;
        Woj = woj;
        Miasto = miasto;
        Ulica = ulica;
        Budynek = budynek;
        KodPoczt = kodPoczt;
        NumerTel = numerTel;
    }
}

