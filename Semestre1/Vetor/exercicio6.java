package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorReversao = new int[5];

        for(int i = 0; i < vetorReversao.length; i++){
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorReversao[i] = scanner.nextInt();

        }

        for(int j = 4; j >= 0; j--){
            System.out.print(vetorReversao[j] + ", ");
        }

        scanner.close();
    }
}
