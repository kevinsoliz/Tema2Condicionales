package Practica;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejer2 {
    public static double pedirValor(String prompt, Scanner sc) {
        double valor = 0;
        boolean valid = false;
        while (!valid) {
            try{
                System.out.print(prompt + " ");
                valor = sc.useLocale(Locale.US).nextDouble();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Valor inválido.");
                sc.next();
            }
        }
        return valor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float comidaDiaria = (float)(pedirValor("Cantidad de comida diaria:", sc));
        byte numAnimales = (byte)(pedirValor("Numero de animales:", sc));
        float kilosPorAnimal = (float)(pedirValor("Kilos de comida por animal:", sc));

        float racionPorAnimal = comidaDiaria / numAnimales;
        if (numAnimales != 0 && racionPorAnimal >= kilosPorAnimal)
            System.out.println("Hay suficiente comida para todos los animales.");
        else if (numAnimales == 0)
            System.out.println("No hay animales.");
        else
            System.out.println("Los animales podrian comer: " + NumberFormat.getNumberInstance().format(racionPorAnimal) + "Kg cada uno.");
    }
}
