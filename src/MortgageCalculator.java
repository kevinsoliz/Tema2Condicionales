import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal;
        double interest;
        int periodMonths;
        double mortgage;

        System.out.print("Principal: ");
        principal = sc.nextDouble();
        System.out.print("Interest: ");
        interest = sc.nextDouble();
        System.out.print("Period(Years): ");
        periodMonths = sc.nextInt();

        double r = (interest / 100) / 12;
        double n = periodMonths * 12;
        double dividendo = r * Math.pow(1 + r, n);
        double divisor = Math.pow(1 + r, n) - 1;

        mortgage = principal * dividendo / divisor;
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance(Locale.US).format(mortgage));
    }
}
