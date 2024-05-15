package Semestre1.Vetor;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorRemove = new int[5];

        for(int i = 0; i < vetorRemove.length; i++){
            System.out.print("Digite o elemento " + i + ": ");
            vetorRemove[i] = scanner.nextInt();
        }
        
        System.out.println("Digite o valor a ser retirado: ");
        int valorRetiado = scanner.nextInt();

        int contador = 0;
        for(int j = 0; j <  vetorRemove.length; j++){
            if(vetorRemove[j] != valorRetiado){
                vetorRemove[contador++] = vetorRemove[j];
            }
        }

        for(int k = 0; k < contador; k++){
            System.out.print(vetorRemove[k] + " ");
        }

        scanner.close();
    }
}
