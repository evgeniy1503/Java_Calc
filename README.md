# Java_Calc

[![GitHub CI](https://github.com/evgeniy1503/Java_Calc/actions/workflows/main.yml/badge.svg)](https://github.com/evgeniy1503/Java_Calc/actions/workflows/main.yml)

Пример работы программы:
Input:
1 + 2

Output:
3

Input:
VI / III

Output:
II

Input:
I - II

Output:
throws Exception //т.к. в римской системе нет отрицательных чисел

Input:
I + 1

Output:
throws Exception //т.к. используются одновременно разные системы счисления

Input:
1

Output:
throws Exception //т.к. строка не является математической операцией

Input:
1 + 2 + 3

Output:
throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)

