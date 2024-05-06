package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorIntercala1 = new int[5];
        int[] vetorIntercala2 = new int[5];

        System.out.println("Vetor 1");
        for(int i = 0; i < vetorIntercala1.length; i++){
            System.out.print("Digite o elemento " + (i+ 1) + ": ");
            vetorIntercala1[i] = scanner.nextInt();
        }


        System.out.println("Vetor 2");
        for(int i = 0; i < vetorIntercala2.length; i++){
            System.out.print("Digite o elemento " + (i+ 1) + ": ");
            vetorIntercala2[i] = scanner.nextInt();
        }

        for(int j = 0; j < vetorIntercala1.length; j++){
            System.out.print(vetorIntercala1[j] + " ");
            for(int k = 0; k < 1; k++){
                System.out.print(vetorIntercala2[j] + " ");
            }
        }

        scanner.close();
    }
}
