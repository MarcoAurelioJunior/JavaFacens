package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorImpar = new int[5];

        for(int i = 0; i < vetorImpar.length; i++){
            System.out.print("Escreva o elemento " + (i + 1) + ": ");
            vetorImpar[i] = scanner.nextInt();
        }

        for(int j = 0; j < vetorImpar.length; j++){
            if(vetorImpar[j] % 2 != 0){
                System.out.print(vetorImpar[j] + ", ");                
            }
        }

        scanner.close();
    }
}
