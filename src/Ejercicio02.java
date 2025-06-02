import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
    static int pedirNumero(Scanner sc){
        int numero = 0;
        boolean valido = false;
        while(!valido){
            try{
                System.out.println("Ingrese un numero: ");
                numero = sc.nextInt();
                valido = true;
            }catch(InputMismatchException e){
                System.out.println("No es un número.");
                sc.next();
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Positivo: " + (pedirNumero(sc) > 0));
    }
}
