package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("adjon meg egy szöveget");
        String szoveg = sc.nextLine();
        String menupont = "";
        while (!menupont.equals("f")) {
            System.out.println("mi legyen a szöveggel");
            System.out.println("\ta nagybetűs");
            System.out.println("\tb kisbetűs");
            System.out.println("\tc lekerdezni a hosszat");
            System.out.println("\td összehasonliatni egy masik szoveggel");
            System.out.println("\te szoveg egy reszet kiirni");
            System.out.println("\tf kilepni");
            System.out.print("adja meg a menupontot");
            menupont = sc.nextLine().toLowerCase();
            switch (menupont) {
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("a szoveg hossza %d karakter \n", szoveg.length());
                    break;
                case "d":
                    System.out.println("masik szoveg");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas = szoveg.compareTo(szoveg2);
                    if (osszehasonlitas < 0) {
                        System.out.println("elso szoveg elorebb van az abcben");
                    } else if (osszehasonlitas > 0) {
                        System.out.println("masodik szoveg elorebb van az abcben");
                    } else {
                        System.out.println("a ket szoveg egyezik");
                    }
                    break;
                case "e":
                    System.out.println("a kezdo karakter sorszama");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("a utolso karakter sorszama");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(szoveg.substring(a - 1, b - 1));
                    break;
                case "f":
                    System.out.println("goodbye");
                    break;
                default:
                    System.out.println("rossz option");
                    break;
            }
        }
    }
}
