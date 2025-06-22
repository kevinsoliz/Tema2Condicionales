package ControlFlow;

public class SimplifyingIfStatements {
    public static void main(String[] args) {
        /*int income = 120_000;
        boolean hasHighIncome;
        if  (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false; */
        //Así es como lo escribiria un principiante

        /*int income = 120_000;
        boolean hasHighIncome = false;
        if  (income > 100_000)
            hasHighIncome = true;*/
        //Aún de principiante

        //Esto es lo que escribe un pro:
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); //Puedes añadir paréntesis para mayor claridad
    }
}
