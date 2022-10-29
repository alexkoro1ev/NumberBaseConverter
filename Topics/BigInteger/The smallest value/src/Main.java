import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger input = new BigInteger(scanner.nextLine());
        int counter = 1;
        BigInteger result = BigInteger.ONE;

        while (true) {
            result = result.multiply(BigInteger.valueOf(counter));
            if (result.compareTo(input) >= 0) {
                break;
            }
            counter++;
        }

        System.out.println(counter);

    }
}