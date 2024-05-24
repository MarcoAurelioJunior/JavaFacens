package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite os valores: ");
            vetor[i] = scanner.nextInt();

            soma += vetor[i];
        }

        int media = 0;

        media = soma / vetor.length;
        System.out.println("A media dos elementos é de " + media);

        scanner.close();
    }
}
