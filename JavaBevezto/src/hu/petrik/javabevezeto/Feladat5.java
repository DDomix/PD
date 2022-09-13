package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A oldal:");
        double a = sc.nextDouble();
        System.out.print("B oldal:");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("K=kerület, T=terület: ");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")) {
            double kerulet = 2 * (a + b);
            System.out.printf("A téglalap kerülete %.2f cm", kerulet);
        } else if (muvelet.equals("T")) {
            double terulet = a * b;
            System.out.printf("A téglalap területe %.2f cm", terulet);
        } else {
            System.out.println("Rossz művelet!");
        }
        sc.nextLine();
        if (a == b){
            System.out.println("Ez egy négyzet!");
        }
    }
}
