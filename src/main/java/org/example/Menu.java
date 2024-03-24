package org.example;

import java.util.ArrayList;
import java.util.Arrays;
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
                    choice2 = scanner.nextInt();
                    break;
                default:
                    System.out.println("Niepoprawna opcja.1");
            }
        }


    }


    public void opcja1( Apteka tab[]){
            for (Apteka apteka : tab) {
                System.out.println("Dane apteki (Miasto) (Ulica): "+apteka.getMiasto()+" "+apteka.getUlica());
            }
    }


}
