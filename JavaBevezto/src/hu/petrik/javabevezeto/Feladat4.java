package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a háromszög oldalait!");
        System.out.print("A:");
        double a = sc.nextDouble();
        System.out.print("B:");
        double b = sc.nextDouble();
        System.out.print("C:");
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("A háromszög kerülete: %.0f", a + b + c);
        } else {
            System.out.println("A háromszög nem szerkeszthető");
        }

    }
}
