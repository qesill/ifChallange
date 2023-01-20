package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Napisz program sprawdzający całkowita liczbe
        i prezentujący informację cz jest ona:
        dotatnia, ujemna lub o wartości zero.
        Wykorzystaj bloki kodu z:
        if
        else if
        else
         */
        Scanner scanner = new
                Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("x > 0");
        } else if (x < 0) {
            System.out.println("x < 0");
        } else {
            System.out.println("x = 0");
        }
    }
}