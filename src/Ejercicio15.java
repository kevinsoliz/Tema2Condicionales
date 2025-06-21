import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15 {
    static int pedirDia(Scanner sc){
        int dia = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce el dia: ");
                dia = sc.nextInt();
                if(dia > 0 && dia <= 31){
                    valid = true;
                } else {
                    System.out.println("El número debe estar entre 0 e 31");
                }
            }catch (InputMismatchException e){
                System.out.println("Número inválido.");
                sc.next();
            }
        }
        return dia;
    }
    static int pedirMes(Scanner sc){
        int numero = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce el mes");
                numero = sc.nextInt();
                if(numero > 0 && numero <= 12){
                    valid = true;
                } else {
                    System.out.println("Entre entre 0 e 12 porfavor");
                }
            }catch (InputMismatchException e){
                System.out.println("Número inválido.");
                sc.next();
            }
        }
        return numero;
    }
    static int pedirAnio(Scanner sc){
        int anio = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce el año");
                anio = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("Año inválido.");
            }
        }
        return anio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dia = pedirDia(sc);
        int mes =  pedirMes(sc);
        int anio = pedirAnio(sc);

        if(dia <= meses[mes - 1]){
            System.out.println("Fecha correcta.");
        } else {
            System.out.println("Fecha incorrectaaaa.");
        }
    }
}
