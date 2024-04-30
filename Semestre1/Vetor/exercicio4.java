package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorMedia = new int[5];
        int soma = 0;
        int calculaMedia = 0;

        for(int i = 0; i < vetorMedia.length; i++){
            System.out.print("Escreva o elemento " + (i + 1) + ": ");
            vetorMedia[i] = scanner.nextInt();

            soma += vetorMedia[i];
        }

        calculaMedia = soma / vetorMedia.length;

        System.out.println("A média de todos os números digitados é de: " + calculaMedia);

        scanner.close();
    }
}
