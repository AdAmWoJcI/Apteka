package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {

         ///Nowe Menu
         Menu menu = new Menu();
         menu.startMenu();

         ///

//         Klient k1 = new Klient("Radek","Dan","1q2w3e4r5");
//
//         System.out.println( "klient1: "+k1);
//
//         Klient[] tablica2;
//         tablica2 =genKlienci(4);
//         System.out.println("---------------");








//         Apteka apteka = new Apteka("Polska", "Lubelskie","Świdnik", "Racławicka", "28","21-040","000000000");
//         Apteka apteka1 = new Apteka("Polska", "Lubelskie","Świdnik1", "Racławicka", "28","21-040","000000000");
//         Apteka apteka2= new Apteka("Polska", "Lubelskie","Świdnik2", "Racławicka", "28","21-040","000000000");
//         Apteka apteka3 = new Apteka("Polska", "Lubelskie","Świdnik3", "Racławicka", "28","21-040","000000000");
//         Apteka apteka4 = new Apteka("Polska", "Lubelskie","Świdnik4", "Racławicka", "28","21-040","000000000");
//
//         Apteka[] tablica = {apteka,apteka1,apteka2,apteka3,apteka4};

         //System.out.println(apteka);

         //zmiana_ulicy(apteka);
         //System.out.println(apteka);

         //apteka.setKraj("Kraj6");

//         Menu menu = new Menu("Pokaz apteki", "Zakoncz");
//         int wybor = -1;
//
//         Scanner scanner = new Scanner(System.in);
//         while (wybor!=0){
//             menu.wyswietl_opcji_menu();
//             System.out.print("Wybor: ");
//             wybor = scanner.nextInt();
//             switch (wybor) {
//                 case 1:
//                     menu.opcja1(tablica);
//                     break;
//             }
//         }

    }

    static void zmiana_ulicy (Apteka a1){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nowa ulice");
         String nowa_ul = scanner.nextLine();
        System.out.println("Podnaj nowy budynek");
         String nowy_budynek = scanner.nextLine();

         a1.setUlica(nowa_ul);
         a1.setBudynek(nowy_budynek);
    }
}
