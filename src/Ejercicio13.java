import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {
    static float pedirNota(Scanner sc){
        float nota = 0F;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce una nota: ");
                nota = sc.useLocale(Locale.US).nextFloat();
                if(nota >= 0 && nota <= 10){
                    valid = true;
                } else{
                    System.out.println("La nota debe ser entre 0 e 10");
                }
            }catch(InputMismatchException e){
                System.out.println("Nota inválida.");
                sc.next();
            }
        }
        return nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = pedirNota(sc);
        if (nota >= 0 && nota <= 4){
            System.out.println("Insuficiente.");
        } else if(nota == 5){
            System.out.println("Suficiente.");
        } else if(nota ==  6){
            System.out.println("Bien.");
        } else if(nota >= 7 && nota <= 8){
            System.out.printf("Notable.");
        } else if(nota >= 9 && nota <= 10){
            System.out.printf("Sobresaliente.");
        }
    }
}
