import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        //Ahora con métodos para que el código se vea más limpio:

        int principal = (int)readNumber("Principal ($1K - $1M): ", 1000, 1_000_000); //Aquí ya estamos casteando al tipo requerido.
        float annualInterest = (float)readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte)readNumber("Period(Years): ", 0, 30);

        double mortgage = calculateMorgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    //Ahora vamos a cargarnos los while loops, pero hay un problema en cada while solicitamos un tipo diferente,
    //crear tres métodos distintos no sería la solución... usaremos un casting:

    public static double readNumber(String prompt, double min, double max ){
        Scanner sc = new Scanner(System.in);
        double value; // una variable genérica para almacenar el valor.
        while (true){
            System.out.print(prompt);
            value = sc.nextFloat();
            if (value > min && value <= max)
                break;
            System.out.println("Enter a value greater than " + min + " and less than or equal to " + max + "."); // Así conseguimos un mensaje de erros genérico.
        }
        return value;
    }

    public static double calculateMorgage(int principal, float annualInterest, byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
}
