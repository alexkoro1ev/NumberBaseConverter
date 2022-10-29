import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] as = scanner.nextLine().split(" ");
        BigInteger a = new BigInteger(as[0]);
        BigInteger b = new BigInteger(as[1]);
        BigInteger c = new BigInteger(as[2]);
        BigInteger d = new BigInteger(as[3]);
        BigInteger res = a.negate().multiply(b).add(c).subtract(d);
//
        System.out.println(res);
    }
}