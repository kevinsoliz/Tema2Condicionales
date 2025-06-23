import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*double principal;
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
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance(Locale.US).format(mortgage));*/

        //Como lo ha hecho Mosh:
        /*
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.print("Principal: ");
        int principal = sc.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat(); //porque los intereses son pequeños.
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        byte years = sc.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR; //the code must be self explanotory

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

         */
        //Ahora con condicionales:
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        while (!(principal > 1000 && principal < 1_000_000)) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1K - $1M): ");
            principal = sc.nextInt();
        }


        float annualInterest = 0;
        while (!(annualInterest > 0 && annualInterest <= 30)){
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.print("Annual Interest Rate: ");
            annualInterest = sc.nextFloat();
        }

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        byte years = 0;
        while (!(years > 0 && years <= 30)){
            System.out.println("Enter a value between 1 and 30.");
            System.out.print("Period(Years): ");
            years = sc.nextByte();
        }

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
