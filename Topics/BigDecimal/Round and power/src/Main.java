import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        int scale = scanner.nextInt();
        String num = scanner.next();

        BigDecimal number = new BigDecimal(num);
        number = number.setScale(scale, RoundingMode.FLOOR);
        number = number.pow(power);
        System.out.println(number);
    }
}