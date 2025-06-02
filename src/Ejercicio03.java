import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
    static int pedirNumero(Scanner sc) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try{
                System.out.println("Introduce un número:");
                numero = sc.nextInt();
                valido = true;

            }catch(InputMismatchException e){
                System.out.println("Número incorrecto");
                sc.next();
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = pedirNumero(sc);
        b = pedirNumero(sc);
        boolean relacion = !(a == b) | a == 0 | b == 0;
        System.out.println(relacion);
    }
}
