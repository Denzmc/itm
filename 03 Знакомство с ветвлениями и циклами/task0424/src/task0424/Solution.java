package task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[0] == arr[1]) System.out.println(3);
        if (arr[2] == arr[1]) System.out.println(1);
        if (arr[0] == arr[2]) System.out.println(2);

        scanner.close();
    }
}
