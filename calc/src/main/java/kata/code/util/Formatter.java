package kata.code.util;

public class Formatter {
    public static final int[] ARABIC_NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static final String[] ROME_NUMBERS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static String checkFormat(String numberOne, String numberTwo) throws Exception {

        boolean isRomeNumOne = false;
        boolean isRomeNumTwo = false;

        for (String num : ROME_NUMBERS) {

            if (num.equals(numberOne)) {
                isRomeNumOne = true;
            }
            if (num.equals(numberTwo)) {
                isRomeNumTwo = true;
            }

        }
        if (isRomeNumOne && isRomeNumTwo) {
            return "Rome";
        } else if (!isRomeNumOne && !isRomeNumTwo) {
            return "Arabic";
        } else {
            throw new Exception("Используются одновременно разные системы счисления");
        }
    }

    public static int romeToInt(String number) {
        int result = 0;
        for (int i = 0; i < ROME_NUMBERS.length; i++) {
            if (ROME_NUMBERS[i].equals(number)) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

}
