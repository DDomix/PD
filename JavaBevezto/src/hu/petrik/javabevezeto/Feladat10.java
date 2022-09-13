package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg addig számokat amég az összegük nem haladja meg a 100-at");
        int szam = 0;
        int paros = 0;
        int paratlan = 0;
        while (szam <= 100) {
            System.out.print("Szám:");
            int seged = sc.nextInt();
            if (seged == 0) {
                System.out.println("0-át ne adj hozzá");
            } else if (seged % 2 == 0) {
                paros++;
                szam = szam + seged;
            } else {
                paratlan++;
                szam = szam + seged;
            }
        }
        System.out.print("Ennyi párosból és ennyi  páratlanból jött ki:");
        System.out.print(paros + " " + paratlan);
    }
}
