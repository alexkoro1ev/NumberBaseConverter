import java.io.BufferedReader;
import java.math.BigDecimal;
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

        System.out.println(n1.add(n2).add(n3));
    }
}