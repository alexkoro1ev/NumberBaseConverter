package converter;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    private final static Scanner scanner = new Scanner(System.in);
    private boolean isFinished;

    public Controller() {
        this.isFinished = false;
    }

    public void makeConversion() {
        String action = chooseAction();
        if (action.split(" ").length == 2) {
            String[] bases = action.split(" ");
            String baseOfNumber = bases[0];
            String targetBase = bases[1];
            convert(baseOfNumber, targetBase);
        } else {
            if ("/exit".equals(action)) {
                isFinished = true;
            } else {
                System.out.println("Wrong command. Try again.");
            }
        }
    }

    private String chooseAction() {
        System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
        return scanner.nextLine();
    }

    private void convert(String baseOfNumber, String targetBase) {
        String number;

        String returned = "";
        while (true) {
            System.out.printf("Enter number in base %s to convert to base %s (To go back type /back) ",
                    baseOfNumber, targetBase);
            number = scanner.nextLine();

            if ("/back".equals(number)) {
                break;
            }

            int base = Integer.parseInt(baseOfNumber);
            int target = Integer.parseInt(targetBase);

            String[] fractionalCheck = number.split("\\.");
            if (fractionalCheck.length == 1) {
                returned = convertInteger(number, base, target);
            } else if (fractionalCheck.length == 2) {
                returned = convertFractional(fractionalCheck[0], fractionalCheck[1], base, target);
            }

            System.out.printf("Conversion result: %s%n%n", returned);
        }
    }

    private String convertInteger(String number, int base, int target) {
        BigInteger numberInBase = new BigInteger(number, base);
        BigInteger numberInTargetBase = new BigInteger(numberInBase.toString(target), target);

        return numberInTargetBase.toString(target);
    }

    private String convertFractional(String integer, String fractional, int base, int target) {
        String integerPart = convertInteger(integer, base, target);

        String fractionalPart = fractionalConversion(fractional, base, target);

        return integerPart + "." + fractionalPart;
    }

    private String fractionalConversion(String fractional, int base, int target) {

        StringBuilder decimal = new StringBuilder();

        int numberDigits = 5;
        int length = Math.min(fractional.length(), numberDigits);
        String[] hexDigits = new String[numberDigits];
        Arrays.fill(hexDigits, "");
        for (int i = 0; i < length; i++) {
            hexDigits[i] = convertInteger(String.valueOf(fractional.charAt(i)), base, 10);
        }

        while ((numberDigits != 0)) {
            int remainder = 0;
            for (int i = length - 1; i >= 0; i--) {
                int value = Integer.parseInt(hexDigits[i]) * target + remainder;
                remainder = value / base;
                hexDigits[i] = String.valueOf(value % base);
            }
            decimal.append(convertInteger(String.valueOf(remainder), 10, target));
            numberDigits--;
        }
        return decimal.toString();
    }

    public boolean isFinished() {
        return isFinished;
    }
}
