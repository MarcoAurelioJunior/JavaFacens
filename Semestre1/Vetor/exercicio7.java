package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorOrdem = new int[5];
        int[] resultadoAtual = new int[5];

        for(int i = 0; i < vetorOrdem.length; i++){
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorOrdem[i] = scanner.nextInt();

            resultadoAtual[i] = vetorOrdem[i];  
        }

        scanner.close();

        

    }
}
