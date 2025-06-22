package ControlFlow;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //Si el número es divisible por 5 tenemos Fizz
        //Si es divisible por 3 tenemos Buzz
        //Si es divisible por ambos tenemos FizzBuzz
        //Si no es divisible por ambos tenemos el mismo número.
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int number = sc.nextInt();

        if ((number % 5 == 0) && (number % 3 == 0)) // Si lo pongo en un else if, me imprimirá dos posibilidades.
            System.out.println("FizzBuzz");         // Las condiciones más específicas deben ir al principio.
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
    }
}
