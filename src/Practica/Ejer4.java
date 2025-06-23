package Practica;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        byte number = sc.nextByte();
        number = (byte) (number > 0 ? number : -number);
        System.out.println("Valor absoluto: " + "|" + number + "|");
    }
}
