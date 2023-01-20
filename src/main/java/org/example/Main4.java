package org.example;
public class Main4 {
    public static void main(String[] args) {
        int points = 0;
        boolean driverLicense = true;
        int expirienceYears = 60;
        boolean drunkDriving = false;
        boolean causedAccident = false;
        boolean overSpeeding = true;

        if (driverLicense == true) {
            points += 20;
        }
        if ((drunkDriving == true) || (causedAccident == true)) {
            points -= 200;
        }
        if (overSpeeding == true) {
            points -= 10;
        }
        if (expirienceYears > 60) {
            points -= 20;
    } else if (expirienceYears > 10) {
            points += 20;
        }
        System.out.println("Punkty: " + points);
    }
}


/*
Ocena punktowa potencjalnych kierowców.
Stwórz prostą ocenę kierowcy zaczynając od początkowych zmiennych:
points = 0 (int), driverLicense (boolean), expirienceYears (int),
drunkDriving (boolean), causedAccident (boolean), overSpeeding (boolean),
Zastosuj instrukcję if do sprawdzenia warunków i dodawania czy odejmowania punktów.

1. Kierowca startuje z ilością 0 punktów, Dostaje +20 jeśli ma prawo jazdy
2. -100 punktów jesli jeździł pod wpływem albo spowodował wypadek
3. -10 jeśli przekraczał prędkość
4. Jeśli ma przynjmniej 10 lat dświadczenia +20pkt
5. Jeśli ma węcej niż 60 lat doświadczenia -20pkt
 */