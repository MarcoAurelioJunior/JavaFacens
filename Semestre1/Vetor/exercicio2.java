package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite os valores: ");
            vetor[i] = scanner.nextInt();

            soma += vetor[i];
        }

        System.out.println("A soma de todos os elementos é de: " + soma);

        scanner.close();
    }
}
