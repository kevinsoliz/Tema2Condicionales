import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        //Ahora sabes la diferencia entre next y nextLine: la primera te lee un token la segunda te lee una linea entera.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine().trim(); // Añades el trim para borrar los dobles espacios solo al principio y al final.
                                            //Para borrar los de en medio tienes que usar el replaceAll(" ", "")
        System.out.println("Digite sua nombre: ");
        String nombre2 = sc.next();

        System.out.println("Nombre 1: " + nome);
        System.out.println("Nombre 2: " + nombre2);
    }
}
