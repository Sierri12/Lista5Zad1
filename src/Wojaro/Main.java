package Wojaro;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Tenisista> tenisisci = new ArrayList();


        FileReader reader = null;
        File file = new File("C:\\Users\\sierr\\Desktop\\Studia\\programowanie obiektowe\\Lista5Zad1\\ATP_ranking_7_10_2019_top50.txt");
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader text = new BufferedReader(reader);
        String line = null;

        try {
            while ((line = text.readLine()) != null) {
                String[] elements = line.split("\t");
                int position = (Integer.valueOf(elements[0]));
                String country = (elements[1]);

                String[] data = elements[2].split(" ");
                String name = data[0];
                String surname="";
                for (int i =1;i<data.length;i++) {
                    surname=surname+" "+data[i];
                }
                int age = (Integer.valueOf(elements[3]));
                int pkt = (Integer.valueOf(elements[4]));
                int matches = (Integer.valueOf(elements[5]));
                Tenisista t = new Tenisista(position, country, name, surname, age, pkt, matches);
                tenisisci.add(t);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Bez sortowania: ");
        System.out.println();
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }
                                                                        //WG WIEKU
        System.out.println();
        System.out.println("Sortowanie wg wieku");
        System.out.println();
        Collections.sort(tenisisci);
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }
                                                                        //WG KRAJU
        System.out.println();
        System.out.println("Sortowanie wg kraju alfabetycznie");
        System.out.println();

        Collections.sort(tenisisci,new CountryComparator());
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }
                                                                    //WG IMIENIA

        System.out.println();
        System.out.println("Sortowanie wg imienia alfabetycznie");
        System.out.println();

        Collections.sort(tenisisci,new NameComparator());
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }

                                                                        //WG NAZWISKA

        System.out.println();
        System.out.println("Sortowanie wg nazwiska alfabetycznie");
        System.out.println();

        Collections.sort(tenisisci,new SurnameComparator());
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }

                                                                        //WG POZYCJI

        System.out.println();
        System.out.println("Sortowanie wg pozycji");
        System.out.println();

        Collections.sort(tenisisci,new PositionComparator());
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }
                                                                        //WG MECZY

        System.out.println();
        System.out.println("Sortowanie wg ilości rozegranych meczy");
        System.out.println();

        Collections.sort(tenisisci,new MatchesComparator());
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }

                                                                        //WG PKT

        System.out.println();
        System.out.println("Sortowanie wg liczby zdobytych punktów");
        System.out.println();

        Collections.sort(tenisisci,new PktComparator());
        for (int i = 0; i < tenisisci.size(); i++) {
            System.out.println(tenisisci.get(i));
        }




    }
}


