package Cube;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hrana krychle: ");
        int hrana = input.nextInt();
        int objem = hrana * hrana * hrana;
        int obsah = 6 * hrana * hrana;
        System.out.println("Objem krychle " + objem);
        System.out.println("Obsah krychle " + obsah);
    }
    }