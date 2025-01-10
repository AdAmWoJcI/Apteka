package org.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        //okno bazowe
        JFrame frame = new JFrame("Logowanie");
        
        // zawartość okna
        JPanel panel = new JPanel();
        
        //elementy do zawartości
        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField(20);
        JLabel passLabel = new JLabel("Haslo");
        JPasswordField passField = new JPasswordField(20);
        JButton loginButton = new JButton("Zaloguj");

        loginButton.addActionListener( e -> {
            LoginManager loginManager = new LoginManager("KlienciMD5.txt");
            if(loginManager.login(emailField.getText(), String.valueOf(passField.getPassword()))){
                JOptionPane.showMessageDialog(frame, "Logowanie udane Witaj w Aptece", "Sukces", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose(); // zamknięcie okna 
            } else {
                JOptionPane.showMessageDialog(frame, "Logowanie nieudane :C", "Błąd", JOptionPane.ERROR_MESSAGE);
                frame.dispose(); // zamknięcie okna 
            }

        });


        //dodanie zawartosci panelu
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);

        
        //podanie panelu do okna
        frame.add(panel);
        //ustawienia okna
        frame.setVisible(true);
        frame.setSize(700, 300);


        
        //loginManager.loginWithStaticData();


    }
}
