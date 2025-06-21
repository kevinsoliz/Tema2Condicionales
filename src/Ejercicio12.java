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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = pedirNum(sc);
        int contador = 0;
        while(num != 0){
            num %= 10;
            contador++;
        }
        System.out.println("Hay " + contador + " cifras.");
    }
}
