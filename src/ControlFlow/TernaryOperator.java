package ControlFlow;

public class TernaryOperator {
    public static void main(String[] args) {
        /*int income = 120_000;
        String className;
        if (income > 100_000)
            className = "First";
        else
            className = "Economy";*/
        //  De principiante.
        /*int income = 120_000;
        String className = "Economy"; // Un pro siempre inicializa.
        if (income > 100_000)
            className = "First";*/

        //Pero también es de principiante.

        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy"; // Ahora sí.
    }
}
