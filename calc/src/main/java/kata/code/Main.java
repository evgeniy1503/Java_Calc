package kata.code;

import java.util.Scanner;

import static kata.code.util.Calculation.calc;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Введите римские или арабские числа для вычисления:");
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();

        String result = calc(expression);
        System.out.println(result);
    }

}
