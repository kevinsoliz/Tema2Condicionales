import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
    static int pedirNumero(Scanner sc) {
        int numero = 0;
        boolean valid =  false;
        while (!valid) {
            try{
                System.out.println("Introduce un numero: ");
                numero = sc.nextInt();
                valid = true;
            }catch(InputMismatchException e){
                System.out.println("No es un numero");
                sc.next();
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = pedirNumero(sc);
        int b = pedirNumero(sc);
        while (a == b){
            b = pedirNumero(sc);
        }
        System.out.println(a > b ? a + " es mayor que " + b : b + " es mayor que " + a);

    }
}
