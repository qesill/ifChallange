package org.example;

public class Main3 {
    public static void main(String[] args) {
        /*
        Wykorzystaj instrukcję if, else if itd
        wraz z operatorami logicznymi czyli AND i OR
        do sprawdzenia pogody i decyzji czy warto pójść na spacer.
        Potrzebujesz następujących zm iennych typu boolean: raining, haveUmbrella.
        Dodatkowo zapisz temperaturę jako int w zmiennej: temperature

        Wymagania:
        1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
        2. Jesli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
        3. Jesli nie pada i powyżej 12 stopni moze wyjść
        4. W innych wypadkach zostaje w domu
        */

        boolean raining = true;
        boolean haveUmbrella = true;
        int temperature = 10;
        if ((temperature > 40) || (temperature < -20)) {
            System.out.println("Pozostań w domu");
        } else if (((temperature >= -10) && (temperature <= 10)) && (raining == true) && (haveUmbrella == true)) {
            System.out.println("Możesz wyjść, ale zabiesz parasol i ciepło sie ubierz");
        } else if ((temperature > 12) && (raining == false)) {
            System.out.println("Piękna pogoda, możesz wyjść");
        } else {
            System.out.println("Zostań w domu");
        }
    }
}
