import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
    static int pedirNumero(Scanner sc){
        int numero = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce el numero:");
                numero = sc.nextInt();
                valid = true;
            }catch (InputMismatchException e){
                System.out.println("No es un numero");
                sc.next();
            }
        }
        return numero;
    }
    static int ordernarDecreciente(int a, int b){
        return a > b ? a : b;
    }
    static int ordernarDecreciente(int a, int b, int c){
        int mayor = ordernarDecreciente(a, b);
        return ordernarDecreciente(c, mayor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = pedirNumero(sc);
        int b = pedirNumero(sc);
        System.out.println(ordernarDecreciente(a,b));
    }
}
