package Semestre1.Vetor;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int maiorElemento = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite os valores: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
            }
        }

        System.out.println("O maior elemento é: " + maiorElemento );

        scanner.close();

    }
}
