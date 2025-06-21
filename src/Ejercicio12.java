import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {
    static int pedirNum(Scanner sc){
        int num = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce un numero: ");
                num = sc.nextInt();
                valid = true;
            } catch(InputMismatchException e){
                System.out.println("No es un numero valido");
                sc.next();
            }
        }
        return num;
    }
    static int contarCifras (int num){
        int cifras = 0;
        if (num == 0){
            cifras = 1;
        } else {
            while (num > 0){
                num /= 10;
                cifras++;
            }
        }
        return cifras;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = pedirNum(sc);
        if(num >= 10_000 && num < 100_000){
            System.out.println(num + " tiene cinco cifras.");
        } else if (num >= 1000 && num < 10_000){
            System.out.println(num + " tiene cuatro cifras.");
        } else if (num >= 100 && num < 1000){
            System.out.println(num + " tiene tres cifras.");
        } else if (num >= 10 && num < 100){
            System.out.println(num + " tiene dos cifras.");
        } else if (num >= 0 && num < 10){
            System.out.println(num + " tiene una cifra.");
        }
        System.out.println("Tiene " + contarCifras(num) + " cifras.");
    }
}
