package task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Requirements:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        String str = "";
        switch (day){
            case 1: str = "Monday";
            break;
            case 2: str = "Tuesday";
            break;
            case 3: str = "Wednesday";
            break;
            case 4: str = "Thursday";
            break;
            case 5: str = "Friday";
            break;
            case 6: str = "Saturday";
            break;
            case 7: str = "Sunday";
            break;
            default: str = "Such day doesn't exist";
        }
        System.out.println(str);

    }
}