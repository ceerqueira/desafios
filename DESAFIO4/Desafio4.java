package com.desafios;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            int n = ler.nextInt();
            ler.nextLine();
            for (int i = 0; i < n; i++) {
                String frase = ler.nextLine();
                System.out.println(inverterFrase(frase));
            }
        } catch (Throwable e) {
            System.out.println("Entrada inválida, por favor insira um número.");
        } finally {
            ler.close();
        }
    }

    // Método para inverter uma string
    private static String inverterFrase(String frase) {
        int tamanho = frase.length();
        String inicio = frase.substring(0, tamanho / 2);
        String fim = frase.substring(tamanho / 2);

        return inverterString(inicio) + inverterString(fim);
    }

    // Método para inverter uma string usando StringBuilder
    private static String inverterString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
