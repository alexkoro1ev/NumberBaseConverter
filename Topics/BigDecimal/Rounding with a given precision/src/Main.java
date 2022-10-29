import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int newScale = scanner.nextInt();

        System.out.println(new BigDecimal(num).setScale(newScale, RoundingMode.HALF_DOWN));
    }   
}