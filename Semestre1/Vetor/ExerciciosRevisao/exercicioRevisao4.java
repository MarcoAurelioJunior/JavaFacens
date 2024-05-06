package Semestre1.Vetor.ExerciciosRevisao;

import java.util.Scanner;
public class exercicioRevisao4 {
    public static void main(String[] args) {

        //Exercicio feito 100% digitado, sem ERRO

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Qual número você gostaria de retirar: ");
        int retiraNum = scanner.nextInt();

        int contador = 0;
        for(int j = 0; j < vetor.length; j++){
            if(vetor[j] != retiraNum){
                vetor[contador++] = vetor[j];
            }
        }

        for(int k = 0; k < contador; k++){
            System.out.print(vetor[k] + " ");
        }

        scanner.close();
    }
}
