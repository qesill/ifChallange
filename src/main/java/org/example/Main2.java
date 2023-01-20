package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
        Napisz program kwalifikujący do oddania krwi
        Taka osoba musi mieć 18 lat i minimum 50kg wagi.
        Uzyj zagnieżdżonych instrukcji if.
        Pamiętaj o informacji dla uzytkownika czy się kwalifikuje
        oraz dlaczego nie spełnia danego warunku.
        Dla uproszszczenia stosuj liczby całkowite.
         */
        System.out.println("Podaj swój wiek");
        Scanner scanner = new
                Scanner(System.in);
        int wiek = scanner.nextInt();
        System.out.println("Podaj swoją wagę");
        int waga = scanner.nextInt();
        System.out.println("Wiek: " + wiek + " Waga: " +waga);
        if (wiek >= 18) {
            if (waga >= 50) {
                System.out.println("Możesz oddać krew");
            }
            else {
                System.out.println("Twoja waga jest za niska");
            }}
        else {
            System.out.println("Twój wiek jest za niski");
            }


    }
}
