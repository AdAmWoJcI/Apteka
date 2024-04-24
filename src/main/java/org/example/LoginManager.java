package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginManager {
    //przygotowana klasa pod obsługe logowania

    //pola klasy
    private final String filePath;
    private ArrayList<Klient> klienci;

    //konstruktory
    public LoginManager(String filePath) {
        this.filePath = filePath;
    }


    //metody
    public boolean login(String email, String password) {
        String md5Password = null;
        try {
            md5Password = convertToMD5(password);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        File file = new File(filePath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            if (parts[9].equals(email) && parts[11].equals(md5Password)) {
                return true;
            }
        }
        scanner.close();
        return false;
    }


    private String convertToMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}
