package kata.code.util;

import static kata.code.util.Formatter.romeToInt;
import static kata.code.util.Rome.convertToRome;

public class Calculation {
    public static final String ROME = "Rome";
    public static final String ARABIC = "Arabic";

    public static final int EXPRESSION_SIZE = 3;
    public static String calc(String input) throws Exception {

        String[] members = input.split(" ");

        if (members.length != EXPRESSION_SIZE) {
            throw new Exception("Строка не соответует формату");
        }

        String numberOne = members[0];

        String numberTwo = members[2];

        String operation = members[1];

        String formatNumbers = Formatter.checkFormat(numberOne, numberTwo);

        switch (formatNumbers) {
            case ROME -> {
                return calcRome(numberOne, numberTwo, operation);
            }
            case ARABIC -> {
                return calcArabic(numberOne, numberTwo, operation);
            }
            default -> throw new Exception("Ошибка вичисления");
        }
    }


    public static String calcRome(String numOne, String numTwo, String operation) throws Exception {
        int numberOne = romeToInt(numOne);
        int numberTwo = romeToInt(numTwo);
        int result;

        switch (operation) {
            case "+" -> {
                result = sum(numberOne, numberTwo);
            }
            case "*" -> {
                result = multi(numberOne, numberTwo);
            }
            case "-" -> {
                if (numberOne <= numberTwo) {
                    throw new Exception("Римские цифры не могут быть отрицательными или равные нулю");
                }
                result = diff(numberOne, numberTwo);
            }
            case "/" -> {
                result = div(numberOne, numberTwo);
            }
            default -> throw new Exception("Не корректный оператор");
        }
        return convertToRome(result);
    }

    public static String calcArabic(String numOne, String numTwo, String operation) throws Exception {
        int numberOne = Integer.parseInt(numOne);
        int numberTwo = Integer.parseInt(numTwo);

        int result = 0;
        switch (operation) {
            case "+" -> {
                result = sum(numberOne, numberTwo);
            }
            case "*" -> {
                result = multi(numberOne, numberTwo);
            }
            case "-" -> {
                result = diff(numberOne, numberTwo);
            }
            case "/" -> {
                result = div(numberOne, numberTwo);
            }
            default -> throw new Exception("Не корректный оператор");
        }
        return String.valueOf(result);

    }

    private static int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    private static int multi(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    private static int diff(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    private static int div(int numOne, int numTwo) {
        return numOne / numTwo;
    }
}
