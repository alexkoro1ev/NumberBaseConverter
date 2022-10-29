import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        String num1 = scanner.next();
        String num2 = scanner.next();

        BigDecimal n1 = new BigDecimal(num);
        BigDecimal n2 = new BigDecimal(num1);
        BigDecimal n3 = new BigDecimal(num2);

        BigDecimal n4 = n1.add(n2).add(n3).divide(new BigDecimal("3"), 0, RoundingMode.DOWN);
        System.out.println(n4);
    }
}