package org.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {
        //okno bazowe
        JFrame frame = new JFrame("Logowanie");
        
        
        // zawartość okna
        JPanel panel = new JPanel();
        JButton receptaButton = new JButton("Odbierz receptę");
        JButton sprlekButton = new JButton("Sprawdz lek");
        JButton histzakupowButton = new JButton("Historia zakupów");
        JButton zwrtlekButton = new JButton("Zwrot leku");
        JButton nearpharmacyButton = new JButton("Najbliższa apteka");
        JButton logoutButton = new JButton("Wyloguj");

}


