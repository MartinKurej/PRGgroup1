package Average;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Prvni cislo ");
        int cislo1 = in.nextInt();

        System.out.print("Druhe cislo ");
        int cislo2 = in.nextInt();

        System.out.print("Treti cislo ");
        int cislo3 = in.nextInt();

        System.out.print("Ctvrte cislo ");
        int cislo4 = in.nextInt();

        System.out.print("Pate cislo ");
        int cislo5 = in.nextInt();


        System.out.println("Prumer vsech cisel je: " +
                (cislo1 + cislo2 + cislo3 + cislo4 + cislo5) / 5);
    }
}