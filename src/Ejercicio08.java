import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio08 {
    static double pedirNumero(Scanner sc, String mensaje){
        double numero = 0;
        boolean valido = false;
        while(!valido){
            try{
                System.out.println(mensaje);
                numero = sc.useLocale(Locale.US).nextDouble();
                valido = true;
            }catch (InputMismatchException e){
                System.out.println("No es un numero");
                sc.next();
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = pedirNumero(sc, "Introduce un número:");
        boolean casiCero = false;

        while(!casiCero){
            if((a > -1 && a < 0) || (a > 0 && a < 1)){
                System.out.println("Es un número casi cero.");
                casiCero = true;
            } else {
                System.out.println("Nop");
                a =  pedirNumero(sc, "Introduce otro:");
            }
        }

    }
}
