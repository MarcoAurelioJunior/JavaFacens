package Semestre1.Vetor;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorMaiorNumero = new int[5];
        int maiorNumero = 0;

        for(int i = 0; i < vetorMaiorNumero.length; i++){
            System.out.print("Escreva o elemento " + (i + 1) + ": ");
            vetorMaiorNumero[i] = scanner.nextInt();

            maiorNumero = vetorMaiorNumero[i];
        }

        for(int j = 0; j < vetorMaiorNumero.length; j++ ){
            if (vetorMaiorNumero[j] > maiorNumero) {
                maiorNumero = vetorMaiorNumero[j];
            }
        }

        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
