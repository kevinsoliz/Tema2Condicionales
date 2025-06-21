import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbers {
    public static void main(String[] args) {
        //para precios, porcentajes, etc.
        //La clase NumberFormat es abastracta por eso el operador new no funciona
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.ITALY); // Dentro especificas el locale del país.
        String precio = currency.format(1110.29);
        System.out.println("Precio: " + precio);

        String porcentaje = NumberFormat.getPercentInstance(Locale.ITALY).format(0.35);
        System.out.println("Porcentaje: " + porcentaje);

        String aSaber = NumberFormat.getCompactNumberInstance().format(1110.29); //Te devuelve una K jaja.
        System.out.println("A saber: " + aSaber);
    }
}
