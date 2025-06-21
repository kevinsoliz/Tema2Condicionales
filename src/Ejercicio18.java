import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dineroRecaudado;
        int aforoMax;
        double precioEntrada;
        int entradasVendidas;

        System.out.println("Ingrese el aforo máximo: ");
        aforoMax = sc.nextInt();
        System.out.println("Ingrese el precio de una entrada: ");
        precioEntrada = sc.nextDouble();
        System.out.println("Ingrese la cantidad de entradas vendidas:");
        entradasVendidas = sc.nextInt();

        if(entradasVendidas <= (aforoMax * 0.2)){
            System.out.println("Concierto cancelado.");
        } else if(entradasVendidas <= (aforoMax * 0.5)){
            precioEntrada = precioEntrada * 0.75;
            System.out.println("Se aplica descuento.");
        }
        dineroRecaudado = precioEntrada * entradasVendidas;
        System.out.println("Dinero recaudado: " + dineroRecaudado);
    }
}
