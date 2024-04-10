package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    //Nowe zmienne zamiast String używamy listy Stringow
    private List<String> MainMenu;
    private  List<String> SubMenuWorker;
    private  List<String> SubMenuCustomer;
    private  List<String> SubMenuAdmin;


    //Zmiany w konstruktorze
    public Menu() {
        MainMenu = new ArrayList<>();
        MainMenu.add("Pracownik apteki");
        MainMenu.add("Klient");
        MainMenu.add("Admin");

        //Pracownik apteki
        SubMenuWorker = new ArrayList<>();
        SubMenuWorker.add("Dostępne leki");

        //Klient
        SubMenuCustomer = new ArrayList<>();
        SubMenuCustomer.add("Odbierz receptę");


        //Admin
        SubMenuAdmin = new ArrayList<>();
        SubMenuAdmin.add("Wyswielt wszystkie apteki");

    }

    public void printMenu(){
        System.out.println("-----MENU----");
        int i =0;
        for (String option: MainMenu){
            i++;
            System.out.println(i+". "+option);
        }
    }

    public void printSubMenu(String opcja, List<String> SubMenu){
        System.out.println("-----"+opcja+"----");
        int i =0;
        for (String option: SubMenu){
            i++;
            System.out.println(i+". "+option);
        }
    }

    public void startMenu() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int choice2 = 0;

        while (choice <= 0 || choice > MainMenu.size()) {
            System.out.print("Wybierz opcję: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printSubMenu(MainMenu.get(choice - 1), SubMenuWorker);
                    choice2 = scanner.nextInt();
                    break;
                case 2:
                    printSubMenu(MainMenu.get(choice - 1), SubMenuCustomer);
                    choice2 = scanner.nextInt();
                    break;
                case 3:
                    printSubMenu(MainMenu.get(choice - 1), SubMenuAdmin);
                    wyswietlDaneAptekZPliku();
                    break;
                default:
                    System.out.println("Niepoprawna opcja.1");
            }
        }
        scanner.close();


    }


    public void opcja1( Apteka tab[]){
            for (Apteka apteka : tab) {
                System.out.println("Dane apteki (Miasto) (Ulica): "+apteka.getMiasto()+" "+apteka.getUlica());
            }
    }

    public static void wyswietlDaneAptekZPliku(){
        List<Apteka> apteki = wczytajAptekiZPlikuTXT("apteki.txt");
        for (Apteka apteka : apteki) {
            System.out.println(apteka.getMiasto()+", "+apteka.getNumerTel());
        }
    }

    public static List<Apteka> wczytajAptekiZPlikuTXT(String sciezkaDoPliku){
        List<Apteka> apteki = new ArrayList<>();
        File plik = new File(sciezkaDoPliku);
        try {
            Scanner odczyt = new Scanner(plik);
            while(odczyt.hasNextLine()){
                String linia = odczyt.nextLine();
                String[] dane = linia.split(",");
                if (dane.length == 8) {
                    apteki.add(new Apteka(dane[0], dane[1], dane[2], dane[3], dane[4], dane[5], dane[6], dane[7]));
                }else{
                    apteki.add(new Apteka(dane[0], dane[1], dane[2], dane[3], dane[4], dane[5], dane[6]));
                }
            }
            odczyt.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Nie znaleziono pliku: "+sciezkaDoPliku);
            e.printStackTrace();
        }
        return apteki;
    } 


}
