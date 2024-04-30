package Semestre1.Vetor;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorInt = new int[5];
        

        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorInt[i] = scanner.nextInt();

        }

        System.out.println("\nSua lista!");
        for (int j = 0; j < vetorInt.length; j++) {
            System.out.print(vetorInt[j] + ", ");
        }
    }
}