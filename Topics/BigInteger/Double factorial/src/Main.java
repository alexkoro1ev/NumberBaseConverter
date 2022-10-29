import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        boolean isEven = n % 2 == 0;
        BigInteger bigInteger = BigInteger.ONE;
        int counter = isEven ? 2 : 1;

        while (counter <= n) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(counter));
            counter += 2;
        }

        return bigInteger;
    }
}