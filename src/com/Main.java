package com;

import java.util.Random;
import java.util.Scanner;

/**
 * Vykhodets Roman, #1
 */
public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    private static void Start() {
        System.out.println("\nCompleted by student AT-212 \nOdessa Polytechnic University \nVykhodets Roman \n\nVariant 1 \n\n");
    }

    /**
     * Дан символ C. Вывести два символа,
     * первый из которых предшествует символу C в кодовой таблице,
     * а второй следует за символом C.
     */
    private static void task3() {
        System.out.println("Task 3:\nДан символ C. Вывести два символа, первый из которых предшествует символу C в кодовой таблице, а второй следует за символом C.\n");

        char signC = 'C';
        System.out.println("Символ перед \"" + signC + "\": " + (char) (signC - 1));
        System.out.println("Символ после \"С\": " + (char) (signC + 1));
    }

    /**
     * Дано целое число N (> 0) и строка S.
     * Преобразовать строку S в строку длины N следующим образом: если длина строки S больше N,
     * то отбросить первые символы, если длина строки S меньше N, то в ее начало добавить символы «.» (точка).
     */
    private static void task26() {
        System.out.println("\n\nTask 26:\nДано целое число N (> 0) и строка S.\nПреобразовать строку S в строку длины N следующим образом:\nесли длина строки S больше N, то отбросить первые символы,\nесли длина строки S меньше N, то в ее начало добавить символы «.» (точка).\n");

        String S = "!Текст";//20
        int N = random.nextInt(20) + 5;
        char sign = '.';


//        do {
//            System.out.print("Введите значение N>0: ");
//            N = scanner.nextInt();
//        }
//        while (N <= 0);

        if (S.length() > N) {
            S = S.substring(1);
        }
        else {
            S = sign + S;
        }

        System.out.println("\nДлина S: " + S.length());
        System.out.println("Значение N: " + N);
        System.out.println("Результат: " + S);


    }


    public static void main(String[] args) {
        Start();
        task3();
        task26();
    }
}
