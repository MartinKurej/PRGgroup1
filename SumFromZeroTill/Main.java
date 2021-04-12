package SumFromZeroTill;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cislo");
        int cislo = input.nextInt();
        int soucet = 0;

        for (int i = 1; i <= cislo; ++i) {
            soucet += i;
        }

        System.out.println("Soucet= " + soucet);
    }
}