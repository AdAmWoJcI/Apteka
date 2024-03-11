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

    public void czyCyfraKraj() {
        boolean zawieraCyfre = false;
        for (int i = 0; i < Kraj.length(); i++) {
            if (Character.isDigit(Kraj.charAt(i))) {
                zawieraCyfre = true;

                }
            }
        if(zawieraCyfre = true){
            System.out.println("Podany kraj zawiera w sobie cyfrę");
        }
    }
    public void czyCyfraWoj() {
        boolean zawieraCyfre = false;
        for (int i = 0; i < Woj.length(); i++) {
            if (Character.isDigit(Woj.charAt(i))) {
                zawieraCyfre = true;
            }
        }
        if(zawieraCyfre = true){
            System.out.println("Podane Województwo zawiera w sobie cyfrę");
        }
    }
    public void czyCyfraMiasto() {
        boolean zawieraCyfre = false;
        for (int i = 0; i < Miasto.length(); i++) {
            if (Character.isDigit(Miasto.charAt(i))) {
                zawieraCyfre = true;
            }
        }
        if(zawieraCyfre = true){
            System.out.println("Podane miasto zawiera w sobie cyfrę");
        }
    }
    public void czyCyfraUlica() {
        boolean zawieraCyfre = false;
        for (int i = 0; i < Ulica.length(); i++) {
            if (Character.isDigit(Ulica.charAt(i))) {
                zawieraCyfre = true;
            }
        }
        if(zawieraCyfre = true){
            System.out.println("Podana ulica zawiera w sobie cyfrę");
        }
    }
}

