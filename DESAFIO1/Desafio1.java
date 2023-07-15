package com.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }
        Arrays.sort(array, new Ordenador());
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        ler.close();
    }

    public static class Ordenador implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            boolean parNum1 = num1 % 2 == 0;
            boolean parNum2 = num2 % 2 == 0;

            if (parNum1 && parNum2) {
                // Ambos são pares, ordem crescente
                return num1.compareTo(num2);
            } else if (!parNum1 && !parNum2) {
                // Ambos são ímpares, ordem decrescente
                return num2.compareTo(num1);
            } else if (parNum1) {
                // num1 é par, num2 é ímpar (num1 vem antes de num2)
                return -1;
            } else {
                // num1 é ímpar, num2 é par (num2 vem antes de num1)
                return 1;
            }
        }
    }
}
