import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio17 {
    static byte pedirDia(Scanner sc){
        byte dia = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce dia: ");
                dia = sc.nextByte();
                if(dia > 0 && dia <= 31){
                    valid = true;
                } else {
                    System.out.println("Dia inválido");
                }
            } catch(InputMismatchException e){
                System.out.println("Dia inválido.");
                sc.next();
            }
        }
        return dia;
    }
    static byte pedirMes(Scanner sc){
        byte mes = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce mes: ");
                mes = sc.nextByte();
                if(mes > 0 && mes <= 12){
                    valid = true;
                } else {
                    System.out.println("Mes no válido");
                }
            } catch(InputMismatchException e){
                System.out.println("Mes inválido");
                sc.next();
            }
        }
        return mes;
    }
    static int pedirAnio(Scanner sc){
        int anio = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce anio: ");
                anio = sc.nextInt();
                valid = true;
            } catch(InputMismatchException e){
                System.out.println("Año inválido.");
                sc.next();
            }
        }
        return anio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        byte dia = pedirDia(sc);
        byte mes = pedirMes(sc);
        int anio = pedirAnio(sc);

        dia++;
        if(dia > meses[mes - 1]){
            dia = 1;
            mes++;
            if(mes > 12){
                mes = 1;
                anio++;
            }
        }
        System.out.printf("%02d-%02d-%02d", dia, mes, anio); //También funciona con /.
    }
}
