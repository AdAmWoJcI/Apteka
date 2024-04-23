package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    //Nowe zmienne zamiast String używamy listy Stringow
    private List<String> MainMenu;
    private List<String> SubMenuWorker;
    private List<String> SubMenuCustomer;
    private List<String> SubMenuAdmin;

    private List<Apteka> AptekaList = wczytajAptekiZPlikuTXT("apteki.txt");


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

    public void printMenu() {
        System.out.println("-----MENU----");
        int i = 0;
        for (String option : MainMenu) {
            i++;
            System.out.println(i + ". " + option);
        }
    }

    public void printSubMenu(String opcja, List<String> SubMenu) {
        System.out.println("-----" + opcja + "----");
        int i = 0;
        for (String option : SubMenu) {
            i++;
            System.out.println(i + ". " + option);
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
                    System.out.print("Wybor: ");
                    choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            wyswietlDaneAptekZPliku();
                            break;
                        case 2:
                            List<Klient> listaKlientow = loadCustomersFromFile("Klienci.txt");
                            System.out.println("wczytani klienci");
                            break;
                    }
                    break;
                default:
                    System.out.println("Niepoprawna opcja.1");
            }
        }
        scanner.close();


    }


    public void opcja1(Apteka tab[]) {
        for (Apteka apteka : tab) {
            System.out.println("Dane apteki (Miasto) (Ulica): " + apteka.getMiasto() + " " + apteka.getUlica());
        }
    }

    public static void wyswietlDaneAptekZPliku() {
        List<Apteka> apteki = wczytajAptekiZPlikuTXT("apteki.txt");
        for (Apteka apteka : apteki) {
            System.out.println(apteka.getMiasto() + ", " + apteka.getNumerTel());
        }
    }

    public static List<Apteka> wczytajAptekiZPlikuTXT(String sciezkaDoPliku) {
        List<Apteka> apteki = new ArrayList<>();
        File plik = new File(sciezkaDoPliku);
        try {
            Scanner odczyt = new Scanner(plik);
            while (odczyt.hasNextLine()) {
                String linia = odczyt.nextLine();
                String[] dane = linia.split(",");
                if (dane.length == 8) {
                    apteki.add(new Apteka(dane[0], dane[1], dane[2], dane[3], dane[4], dane[5], dane[6], dane[7]));
                } else {
                    apteki.add(new Apteka(dane[0], dane[1], dane[2], dane[3], dane[4], dane[5], dane[6]));
                }
            }
            odczyt.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Nie znaleziono pliku: " + sciezkaDoPliku);
            e.printStackTrace();
        }
        return apteki;
    }

    public List<Klient> loadCustomersFromFile(String filePath) {
        List<Klient> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Ominięcie pierwszej linii, która zawiera nagłówki kolumn
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 14) { // Upewnij się, że linia zawiera wszystkie wymagane dane
                    Klient customer = new Klient(
                            data[0], data[1], data[2], data[3], data[4], data[5], data[6],
                            data[7], data[8], data[9], data[10],
                            data[11], data[12], data[13]
                    );
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return customers;
    }


}
