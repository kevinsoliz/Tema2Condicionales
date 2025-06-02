import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
    static int pedirNumero(Scanner sc) {
        int num = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce el numero: ");
                num = sc.nextInt();
                valido = true;
            }catch (InputMismatchException e){
                System.out.println("El numero introducido no es valido");
                sc.next();
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Es par: " + (pedirNumero(sc) % 2 == 0));
    }
}
