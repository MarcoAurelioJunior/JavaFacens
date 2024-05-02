package Semestre1.Vetor;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorRemove = new int[5];

        for(int i = 0; i < vetorRemove.length; i++){
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorRemove[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que você deseja tirar: ");
        int retira = scanner.nextInt();

        int contador = 0;

        for (int j = 0; j < 5; j++) {
            if (vetorRemove[j] != retira) { //Se algum elemento for diferente do número que quer retirar então...
                vetorRemove[contador++] = vetorRemove[j]; //No indice 1 da lista, adicione o elemento que for diferente
            } // Se o elemento for igual ao que quer retirar então ele apenas ignora, e coloca +1 no contador que pula um elemento
        }

        for (int k = 0; k < contador; k++) {
            System.out.println(vetorRemove[k] + ", " );
        }

        scanner.close();        
    }
}
