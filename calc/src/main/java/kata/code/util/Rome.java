package kata.code.util;

public class Rome {
    private static final int[] ARABIC = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static final String[] ROME = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    public static String convertToRome(int num) {
        int i = ROME.length - 1;
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            while (ARABIC[i] > num) {
                i--;
            }
            result.append(ROME[i]);
            num -= ARABIC[i];

        }
        return result.toString();
    }
}
