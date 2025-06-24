package Practica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte resultado = 0;
        do {
            byte numAleatorio1 = getNumAleatorio();
            byte numAleatorio2 = getNumAleatorio();
            byte suma = (byte)(numAleatorio1 + numAleatorio2);

            System.out.print(numAleatorio1 + " + " + numAleatorio2 + " = ");
            resultado = leerNumero(sc);
            if(resultado != -1)
                System.out.println(verificar(suma, resultado) ? "Has acertado!" : "Incorrecto :(");
            else
                continue;
        } while (resultado != -1);


    }

    private static byte getNumAleatorio() {
        return (byte)((Math.random() * 100) + 1);
    }
    public static byte pedirNumero(Scanner sc){
        byte num = 0;
        boolean valid = false;
        while(!valid){
            try {
                //System.out.println("Introduzca el resultado: ");
                num = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Número no válido");
                sc.next();
            }
        }
        return num;
    }
    public static boolean verificar(byte numAleatorio, byte numIntroducido){
        return (numAleatorio == numIntroducido);
    }
    //Esto es de chati:
    private static Byte leerNumero(Scanner sc) {
        while (true) {
            try {
                return sc.nextByte();
            } catch (InputMismatchException e) {
                String entrada = sc.next();
                if (entrada.equals("-1")) {
                    return null;
                }
                System.out.println("Número no válido. Inténtalo de nuevo:");
            }
        }
    }
}
