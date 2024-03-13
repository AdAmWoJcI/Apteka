package org.example;

public class Menu {
    private String opcja1;


    private String opcja2;

    public String getOpcja1() {
        return opcja1;
    }

    public String getOpcja2() {
        return opcja2;
    }

    public Menu(String opcja1, String opcja2) {
        this.opcja1 = opcja1;
        this.opcja2 = opcja2;
    }

    public void wyswietl_opcji_menu(){
        System.out.println("Menu (dostępne opcje):");
        System.out.println("1. "+opcja1);
        System.out.println("0."+opcja2);
    }

    public void opcja1( Apteka tab[]){
            for (Apteka apteka : tab) {
                System.out.println("Dane apteki (Miasto) (Ulica): "+apteka.getMiasto()+" "+apteka.getUlica());
            }
    }


}
