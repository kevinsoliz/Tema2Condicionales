import java.util.Date;

public class Types {
    public static void main(String[] args) {
        float price = 10.88F;
        long countViews = 2_000_000_0000L;
        long count = 3_999_999_999L;
        //El compilador de java lee los números como int o float solamente.
        byte age = 20;
        Date date = new Date();
        System.out.println(date);
    }
}
