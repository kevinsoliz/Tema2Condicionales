import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
    static int pedirNumero(Scanner sc) {
        int num = 0;
        boolean valido = false;
        while (!valido) {
            try{
                System.out.println("Introduce el numero: ");
                num = sc.nextInt();
                valido = true;
            }catch(InputMismatchException e){
                System.out.println("El numero introducido no es valido");
                sc.next();
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = pedirNumero(sc);
        int b = pedirNumero(sc);
        System.out.println(a + " es multiplo de " + b + ": " + (b % a == 0));
    }
}
