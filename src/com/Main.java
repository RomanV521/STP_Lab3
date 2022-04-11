package com;

import java.util.Arrays;
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

        StringBuilder S = new StringBuilder("!Текст");//20
        int N = random.nextInt(20) + 5;
        char sign = '.';


//        do {
//            System.out.print("Введите значение N>0: ");
//            N = scanner.nextInt();
//        }
//        while (N <= 0);

        if (S.length() > N) {
            S = new StringBuilder(S.substring(1));
        }
        else {
           // S = new StringBuilder().append(sign) + S;
        }

        System.out.println("\nДлина S: " + S.length());
        System.out.println("Значение N: " + N);
        System.out.println("Результат: " + S);
    }

    /**
     * Дана строка, состоящая из слов кириллицей,
     * набранных заглавными буквами и разделенных пробелами (одним или несколькими).
     * Преобразовать каждое слово в строке,
     * заменив в нем все предыдущие вхождения его последней буквы на символ «.» (точка).
     * Например, слово «МИНИМУМ» надо преобразовать в «.ИНИ.УМ». Количество пробелов между словами не изменять.
     */

    private static void task49(){
        System.out.println("\n\nTask 49:\nДана строка, состоящая из слов кириллицей, набранных заглавными буквами и разделенных пробелами (одним или несколькими).\nПреобразовать каждое слово в строке, заменив в нем все предыдущие вхождения его последней буквы на символ «.» (точка).\nНапример, слово «МИНИМУМ» надо преобразовать в «.ИНИ.УМ».\nКоличество пробелов между словами не изменять.\n\n");

        char replaceChar='.';
        String text="МИНИМУМ БОЛОТО МОЛОКО МАКСИМУМ АРЕНДА";
        System.out.println(text);

        String replaceStr= replaceChar(replaceChar,text);
        System.out.println(replaceStr);
    }

    private static String replaceChar(char replaceChar, String text){
        String deli = " ";// Разделительный знак
        String[] subStr= text.replaceAll("\\s+", " ").split(deli);
        String firstPart, lastPart;
        char lastChar;

        for (int i=0; i<subStr.length; i++){
            lastChar = subStr[i].charAt(subStr[i].length()-1);
            firstPart = subStr[i].substring(0,subStr[i].length()-1);
            lastPart = subStr[i].substring(subStr[i].length()-1);

            firstPart=firstPart.replace(lastChar, replaceChar);
            subStr[i]=firstPart+lastPart+" ";

        }
        return Arrays.toString(subStr);
    }

    /**
     * Дана строка.
     * Подсчитать общее количество содержащихся в ней строчных латинских и кириллических букв.
     */
    private static void task15(){
        System.out.println("\n\nTask 15:\nДана строка. Подсчитать общее количество содержащихся в ней строчных латинских и кириллических букв.\n\n");

        String text ="Україна!!!, England. redh, Дом";
        String deli = " ";
        String[] subStr= text.replaceAll("[\\\\,.!?:;]"," ").replaceAll("\\s+", " ").split(deli);

        int latin=text.replaceAll("[^A-Za-z]", "").length();
        int cyrillic=text.replaceAll("[^А-Яа-я]", "").length();
        int ua=text.replaceAll("[\\\\,.!?:;]"," ").replaceAll("[^ґ,Ґ,є,Є,ї,Ї,і,І]", "").length();

        System.out.println("Латинских символов"+latin);
        System.out.println("Кириллических символов: "+cyrillic+ua);
        System.out.println("Длина строки: "+text.length());
        System.out.println("Строка:\n"+Arrays.toString(subStr));

    }

    public static void main(String[] args) {
//        Start();
//        task3();
//        task26();
//        task49();
        task15();
    }
}
