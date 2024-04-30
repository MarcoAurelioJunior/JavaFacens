package Semestre1.Vetor;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorIntSoma = new int[5];
        int soma = 0;

        for (int i = 0; i < vetorIntSoma.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorIntSoma[i] = scanner.nextInt();

            soma += vetorIntSoma[i];

        }

        System.out.println("O resultado da soma de todos os números é de: " + soma);
    }
}
