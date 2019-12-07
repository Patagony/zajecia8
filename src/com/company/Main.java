package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        wyswietl();
        figury();

        double a = 0;
        double b = 1;
        double c = 2;
        double d = 3;
        System.out.println("NAPIS");
        System.out.println("ZMIENNE");
    }

    static void figury() {

        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++)
                System.out.print("X");
            System.out.println("");
        }

    }

    static void wyswietl() {

        String nazwisko;
        String imie;
        int wzrost;
        String address;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nazwisko: ");
        nazwisko = scanner.next();
        System.out.print("Imie: ");
        imie = scanner.next();
        System.out.print("Wzrost: ");
        wzrost = scanner.nextInt();
        System.out.print("Adres: ");
        address = scanner.next();

        System.out.println(nazwisko);
        System.out.println(imie);
        System.out.println(wzrost);
        System.out.println(address);

    }
}
