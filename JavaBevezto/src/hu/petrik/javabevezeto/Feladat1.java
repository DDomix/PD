package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a medence átmérőjét:");
        double atmero = sc.nextDouble();
        System.out.print("Add meg a medence melységét:");
        double melyseg = sc.nextDouble();
        double sugar = atmero/2;
        double korterulet = sugar * sugar * Math.PI;
        double terfogat = korterulet * melyseg;
        System.out.printf("A medencébe %.2f köbméter víz fér", terfogat);
    }
}
