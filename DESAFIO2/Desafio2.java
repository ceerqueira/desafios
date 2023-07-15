package com.desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double valor = ler.nextDouble();
        Integer[] troco;
        troco = calcularTroco(valor);
        imprimir (troco);
        ler.close();
    }

    private static void imprimir(Integer[] troco) {
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", troco[0]);
        System.out.printf("%d nota(s) de R$ 50.00\n", troco[1]);
        System.out.printf("%d nota(s) de R$ 20.00\n", troco[2]);
        System.out.printf("%d nota(s) de R$ 10.00\n", troco[3]);
        System.out.printf("%d nota(s) de R$ 5.00\n", troco[4]);
        System.out.printf("%d nota(s) de R$ 2.00\n", troco[5]);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", troco[6]);
        System.out.printf("%d moeda(s) de R$ 0.50\n", troco[7]);
        System.out.printf("%d moeda(s) de R$ 0.25\n", troco[8]);
        System.out.printf("%d moeda(s) de R$ 0.10\n", troco[9]);
        System.out.printf("%d moeda(s) de R$ 0.05\n", troco[10]);
        System.out.printf("%d moeda(s) de R$ 0.01\n", troco[11]);
    }

    private static Integer[] calcularTroco(Double valor) {
        Integer[] troco = new Integer[12];
        troco[0] = (int) (valor / 100);
        troco[1] = (int) ((valor % 100) / 50);
        troco[2] = (int) ((valor % 100) % 50) / 20;
        troco[3] = (int) (((valor % 100) % 50) % 20) / 10;
        troco[4] = (int) ((((valor % 100) % 50) % 20) % 10) / 5;
        troco[5] = (int) (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        Double moedas = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;
        moedas = moedas * 100;
        troco[6] = (int) (moedas / 100);
        troco[7] = (int) ((moedas % 100) / 50);
        troco[8] = (int) ((moedas % 100) % 50) / 25;
        troco[9] = (int) (((moedas % 100) % 50) % 25) / 10;
        troco[10] = (int) ((((moedas % 100) % 50) % 25) % 10) / 5;
        troco[11] = (int) Math.ceil((((((moedas % 100) % 50) % 25) % 10) % 5) / 1);

        return troco;
    }

}
