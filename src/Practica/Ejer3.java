package Practica;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = (float)(pedirValor("Introduce la base:", sc));
        float altura = (float)(pedirValor("Introduce la altura:", sc));
        float area = base * altura / 2;
        System.out.println("El área es: " + NumberFormat.getNumberInstance().format(area));
    }
    public static double pedirValor(String prompt, Scanner sc) {
        double valor = 0;
        boolean valido = false;
        while (!valido) {
            try{
                System.out.print(prompt + " ");
                valor = sc.nextDouble();
                if (valor >= 0)
                    valido = true;
                else
                    System.out.println("El valor debe ser mayor o igual que 0.");
            }catch(InputMismatchException e){
                System.out.println("Valor inválido.");
                sc.next();
            }
        }
        return valor;
    }
}

