package task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Requirements:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();

        if (n1.equals(n2))
            System.out.println("Имена идентичны");
        else if (n1.length() == n2.length())
            System.out.println("Длины имен равны");

    }
}
