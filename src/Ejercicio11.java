import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {
    static int pedirNumero(Scanner sc){
        int num = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce un numero: ");
                num = sc.nextInt();
                valid = true;
            }catch(InputMismatchException e){
                System.out.println("No es un numero");
                sc.next();
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = pedirNumero(sc);
        int b = pedirNumero(sc);
        int c = pedirNumero(sc);

        double dentroRaiz = Math.pow(b, 2) - 4 * a * c;
        double raiz = Math.sqrt(dentroRaiz);
        if (raiz >= 0 && a != 0){
            double x1 = (-b + raiz) / (2 * a);
            double x2 = (-b - raiz) / (2 * a);
            System.out.println("Primera solución: " + x1);
            System.out.println("Segunda solucion: " + x2);
        } else {
            System.out.println("No tiene solución.");
        }



    }
}
