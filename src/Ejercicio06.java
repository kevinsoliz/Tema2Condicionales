import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
    static int pedirNumero(Scanner sc) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try{
                System.out.println("Introduce el numero: ");
                numero = sc.nextInt();
                valido = true;
            }catch(InputMismatchException e){
                System.out.println("El numero introducido no es valido");
                sc.next();
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Son iguales: " + ((pedirNumero(sc) == pedirNumero(sc))));
    }
}
