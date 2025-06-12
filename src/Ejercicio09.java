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
    static void ordernarDecreciente(int a, int b, int c){
       int primer = ordernarDecreciente(a, b);
       int mayor = 0;
       int medio = 0;
       int menor = 0;
       if (primer >= c){
           mayor = primer;
           if (c > b){
               medio = c;
               menor = b;
           }
       } else if(primer <= c){
           mayor = c;
           medio = a;
           menor = b;
       }
        System.out.println(mayor + ", " + medio + ", " + menor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = pedirNumero(sc);
        int b = pedirNumero(sc);
        int c = pedirNumero(sc);
        //System.out.println(ordernarDecreciente(a,b));
        ordernarDecreciente(a, b, c);
    }
}
