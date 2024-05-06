package Semestre1.Vetor.ExerciciosRevisao;

import java.util.Scanner;
public class exercicioRevisao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Escreva o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int contador = 0;
        for (int j = 0; j < vetor.length; j++) {
            if(vetor[j] > 0){ //Passa no if se o valor for maior que ZERO
                vetor[contador++] = vetor[j]; //Aumenta 1 ao contador e adiciona apenas os números que passaram no IF
            }
        }

        for (int k = 0; k < contador; k++) {
            System.out.println(vetor[k] + " ");
        }

        scanner.close();
    }
}
