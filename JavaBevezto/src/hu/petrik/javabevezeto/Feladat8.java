package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Fej(0) vagy írás(1): ");
        int tipp = sc.nextInt();
        int szam = rnd.nextInt(2);
        while (tipp!=szam){
            System.out.print("Tippelj újra: ");
            tipp = sc.nextInt();
            szam = rnd.nextInt(2);
        }
        System.out.println("Gratulálok nyertél!");
    }
}
