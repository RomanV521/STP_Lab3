package com;

import java.util.Random;

/**
 * Vykhodets Roman, #1
 */
public class Main {

    private static void Start() {
        System.out.println("\nCompleted by student AT-212 \nOdessa Polytechnic University \nVykhodets Roman \n\nVariant 1 \n\n");
    }

    /**
     * Дан символ C. Вывести два символа,
     *  первый из которых предшествует символу C в кодовой таблице,
     *  а второй следует за символом C.
     */
    private static void task3(){
        System.out.println("Task 3:\nДан символ C. Вывести два символа, первый из которых предшествует символу C в кодовой таблице, а второй следует за символом C.\n");

        char signC='C';
        System.out.println("Символ перед \"С\": "+ (char) (signC-1));
        System.out.println("Символ после \"С\": "+ (char) (signC+1));

    }


    public static void main(String[] args) {
	    Start();
        task3();
    }
}
