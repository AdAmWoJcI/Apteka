package org.example;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         Apteka apteka = new Apteka("Polska", "Lubelskie","Świdnik", "Racławicka", "28","21-040","000000000");




         System.out.println(apteka);

         zmiana_ulicy(apteka);
         System.out.println(apteka);

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
