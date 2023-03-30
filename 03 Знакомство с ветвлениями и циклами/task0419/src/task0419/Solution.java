package task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[4];
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        arr[0] = a;
        int b = scanner.nextInt();
        arr[1] = b;
        int c = scanner.nextInt();
        arr[2] = c;
        int d = scanner.nextInt();
        arr[3] = d;

        Arrays.sort(arr);
        System.out.println(arr[3]);
    }
}
