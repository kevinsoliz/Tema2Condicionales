package ControlFlow;

import java.util.Scanner;

public class BreakAndContinueStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = sc.nextLine().toLowerCase();
            System.out.println(input);
        }*/
        //No queremos que quit salga también:
        /*
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = sc.nextLine().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input); //Una manera de hacerlo
        }
        */
        //Ahora con break
        /*
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = sc.nextLine().toLowerCase();
            if (input.equals("quit"))
                break; // break rompe el loop
            System.out.println(input);
        }
        */

        //Ahora añadiendo otra palabra
/*
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = sc.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue; // El loop volverá al principio
            if (input.equals("quit"))
                break;
            System.out.println(input)
        }
        */
        //Ya no necesitamos la primera condición:
        String input = "";
        while (true) { //directament true pero siempre tiene que haber un break.
            System.out.println("Input: ");
            input = sc.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue; // El loop volverá al principio
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

    }
}
