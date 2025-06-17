import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
    static int pedirNumero(Scanner sc){
        int num = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce un numero: ");
                num = sc.nextInt();
                valid = true;
            }catch(InputMismatchException e){
                System.out.println("Número invalido.");
                sc.next();
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a =  pedirNumero(sc);
        b =  pedirNumero(sc);
        c =  pedirNumero(sc);

        if (a > b && b > c){
            System.out.println(a + ", " + b + ", " + c);
        } else if (a > c && c > b){
            System.out.println(a + ", " + c + ", " + b);
        } else if (b > a && a > c){
            System.out.println(b + ", " + a + ", " + c);
        } else if (b > c && c > a){
            System.out.println(b + ", " + c + ", " + a);
        } else if (c > a && a > b){
            System.out.println(c + ", " + a + ", " + b);
        } else if (c > b && b > a){
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
