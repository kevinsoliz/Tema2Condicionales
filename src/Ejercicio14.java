import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14 {
    static int pedirNumero(Scanner sc){
        int num = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce un numero.");
                num = sc.nextInt();
                if(num > 0 && num <= 7){
                    valid = true;
                } else {
                    System.out.println("El número debe estar entre 0 e 7");
                }
            }catch (InputMismatchException e){
                System.out.println("Número inválido.");
                sc.next();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = pedirNumero(sc);
        switch(num){
            case 1 -> System.out.println("Lunes"); // Si pongo llaves a una sola línea de código, me saldrá que es redundante.
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Error");
        }
    }
}
