package Practica;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu número de DNI: ");
        int dni = sc.nextInt();
        byte letra = (byte) (dni % 23);
        switch (letra) {
            case 0 -> System.out.println("Tu letra es la: T");
            case 1 -> System.out.println("Tu letra es la: R");
            case 2 -> System.out.println("Tu letra es la: W");
            case 3 -> System.out.println("Tu letra es la: A");
            case 4 -> System.out.println("Tu letra es la: G");
            case 5 -> System.out.println("Tu letra es la: M");
            case 6 -> System.out.println("Tu letra es la: Y");
            case 7 -> System.out.println("Tu letra es la: F");
            case 8 -> System.out.println("Tu letra es la: P");
            case 9 -> System.out.println("Tu letra es la: D");
            case 10 -> System.out.println("Tu letra es la: X");
            case 11 -> System.out.println("Tu letra es la: B");
            case 12 -> System.out.println("Tu letra es la: N");
            case 13 -> System.out.println("Tu letra es la: J");
            case 14 -> System.out.println("Tu letra es la: Z");
            case 15 -> System.out.println("Tu letra es la: S");
            case 16 -> System.out.println("Tu letra es la: Q");
            case 17 -> System.out.println("Tu letra es la: V");
            case 18 -> System.out.println("Tu letra es la: H");
            case 19 -> System.out.println("Tu letra es la: L");
            case 20 -> System.out.println("Tu letra es la: C");
            case 21 -> System.out.println("Tu letra es la: K");
            case 22 -> System.out.println("Tu letra es la: E");
            default ->  System.out.println("Ha ocurrido un error.");
        }
    }
}
