package org.example;

import java.time.LocalDate;

public class Lek {
private String nazwa;
private String producent;
private float cena;
private int ilosc;
private LocalDate dataWaznosci;
private boolean czyBezRecepty;
private String opis;


//konstruktor
public Lek (String name, String producent, float price, int quantities, LocalDate expirationDate, boolean isPrescription, String description){
    this.nazwa = name;
    this.producent = producent;
    this.cena = price;
    this.ilosc = quantities;
    this.dataWaznosci = expirationDate;
    this.czyBezRecepty = isPrescription;
    this.opis = description;
}

//Metody dostepowe (gettery i settery)
public String getNazwa (){
    return nazwa;
}
public void setNazwa (String nazwa){
    this.nazwa = nazwa;
}

public String getProducent() {
    return producent;
}

public void setProducent(String producent) {
    this.producent = producent;
}

public float getCena() {
    return cena;
}

public void setCena(float cena) {
    this.cena = cena;
}

public int getIlosc() {
    return ilosc;
}

public void setIlosc(int ilosc) {
    this.ilosc = ilosc;
}

public LocalDate getDataWaznosci() {
    return dataWaznosci;
}

public void setDataWaznosci(LocalDate dataWaznosci) {
    this.dataWaznosci = dataWaznosci;
}

public boolean isCzyBezRecepty() {
    return czyBezRecepty;
}

public void setCzyBezRecepty(boolean czyBezRecepty) {
    this.czyBezRecepty = czyBezRecepty;
}

public String getOpis() {
    return opis;
}

public void setOpis(String opis) {
    this.opis = opis;
}

//metoda do wyswietlania informacji o leku
public String wyswietlInfo(){
    String temp = "Nazwa:"+ nazwa +"\n"+ cena;
    return temp;
}

public void wyswietlInfo2(){
    System.out.println("Nazwa: "+nazwa); 
}
    
}