package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Prvni cislo:");
        int cislo1 = input.nextInt();
        System.out.println("Druhe cislo:");
        int cislo2 = input.nextInt();
        System.out.println("Treti cislo:");
        int cislo3 = input.nextInt();
        int soucet = cislo1 + cislo2 + cislo3;
        System.out.println("Soucet vsech cisel:" + soucet);
    }
    }