package Semestre1.Vetor.ExerciciosRevisao;

import java.util.Scanner;
public class exercicioRevisao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Escreva o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int contador = 0;
        for (int j = 0; j < vetor.length; j++) {
            if(vetor[j] != vetor[j]){
                vetor[contador] = vetor[j];
            }
        }

        for (int k = 0; k < contador; k++) {
            System.out.println(vetor[k] + " ");
        }

        scanner.close();
    }
}
