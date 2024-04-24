package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pass = "haslo123";
        String mail= "jan.kowalski@example.com";


        LoginManager loginManager = new LoginManager("KlienciMD5.txt");


        ///Nowe Menu
        Menu menu = new Menu();
        if (loginManager.login(mail,pass)){
            menu.startMenu();
        }else {
            System.out.println("Błedne dane logowania");
        }


    }
}
