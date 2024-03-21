package org.example;

import java.util.Random;

public class GenKlient {
    private static String [] fnames = {"Arek", "Kamil", "Zbyszek","Krzysiek"};
    private static String [] lnames = {"Dan", "Szewczyk", "Kowalski","Kos"};

    public static Klient[] genKlienci (int ilosc){
        Klient [] tabk = new Klient[ilosc];
       for (int i =0; i<ilosc;i++){
           Random random = new Random();
           int losowa = random.nextInt(fnames.length);

            Klient k = new Klient(fnames[losowa],lnames[losowa]);
            tabk[i] = k;
       }
       return tabk;
    }

}
