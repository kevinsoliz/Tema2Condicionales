import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16 {
    static byte pedirSegundos(Scanner sc){
        byte segundos = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce el segundo: ");
                segundos = sc.nextByte();
                if(segundos >= 0 && segundos <= 60){
                    valid = true;
                }else {
                    System.out.println("El segundo introducido no es valido");
                }
            } catch (InputMismatchException e){
                System.out.println("El segundo introducido no es valido");
                sc.next();
            }
        }
        return segundos;
    }
    static byte pedirMinutos(Scanner sc){
        byte minutos = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce el minuto: ");
                minutos = sc.nextByte();
                if(minutos >= 0 && minutos <= 60){
                    valid = true;
                } else {
                    System.out.println("El minuto introducido no es valido");
                }
            } catch (InputMismatchException e){
                System.out.println("El minuto introducido no es valido");
                sc.next();
            }
        }
        return minutos;
    }
    static byte pedirHora(Scanner sc){
        byte horas = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Introduce la hora: ");
                horas = sc.nextByte();
                if(horas >= 0 && horas <= 23){
                    valid = true;
                } else {
                    System.out.println("La hora introducida no es valida");
                }
            }catch (InputMismatchException e){
                System.out.println("La hora introducida no es valida");
                sc.next();
            }
        }
        return horas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte segundos = pedirSegundos(sc);
        byte minutos = pedirMinutos(sc);
        byte horas = pedirHora(sc);

        segundos++;
        if(segundos > 59){
            segundos = 0;
            minutos++;
            if(minutos > 59){
                minutos = 0;
                horas++;
                if(horas > 23){
                    horas = 0;
                }
            }
        }
        System.out.println("Hora: " + horas + ":" + minutos + ":" + segundos);
        //Ahora añade formato, recuerda usa printf siempre:
        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);

    }
}
