package org.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Pierwsze okno");
        JButton button = new JButton("Zamknij");

        button.addActionListener( new ActionListner() {
            @Override
            public void actionPerfomed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(button);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 300);
        frame.setVisible(true);

        LoginManager loginManager = new LoginManager("KlienciMD5.txt");
        loginManager.loginWithStaticData();

        





    }
}
