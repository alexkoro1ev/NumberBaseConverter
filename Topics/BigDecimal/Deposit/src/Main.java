import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String amount = scanner.next();
        String interest = scanner.next();
        int years = scanner.nextInt();

        BigDecimal total = new BigDecimal(amount);
        BigDecimal rate = new BigDecimal(interest);
        rate = rate.divide(new BigDecimal("100")).add(BigDecimal.ONE).pow(years).multiply(total);
        System.out.println("Amount of money in the account: " + rate.setScale(2, RoundingMode.CEILING));
    }
}