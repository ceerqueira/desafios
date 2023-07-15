package com.desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            int n = ler.nextInt();
            int k = ler.nextInt();
            Integer[] array = new Integer[n];

            for (int i = 0; i < n; i++) {
                array[i] = ler.nextInt();
            }

            System.out.println(contarParesComDiferencaAbsoluta(array, k));

        } catch (Throwable e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");

        } finally {
            ler.close();
        }
    }

    // Método para contar o número de pares no array cuja diferença absoluta é igual a k
    public static int contarParesComDiferencaAbsoluta(Integer[] array, int k) {
        int contagem = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) == Math.abs(k)) {
                    contagem++;
                }
            }
        }

        return contagem;
    }
}
