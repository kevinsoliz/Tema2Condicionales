import java.awt.*;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y);
        //Son variables independientes
        Point p = new Point(1, 1);
        Point p2 = p; // adress to p point in memory.
        System.out.println(p2);
        // p guarda la dirección de memoria del objeto. Ambas variables referencian el mismo objeto.
        p2.x = 3;
        System.out.println(p2);
        // reference types are copied by their reference and primitives are copied by their value.

    }
}
