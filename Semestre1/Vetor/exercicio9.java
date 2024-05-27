package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorIntercala1 = {10, 20, 30, 40, 50};
        int[] vetorIntercala2 = {1, 2, 3, 4, 5};

        int contador = 0;

        for(int i = 0; i < vetorIntercala1.length; i++){
            System.out.println(vetorIntercala1[i]);
            
            for(int j = 0; j < 1; j++){
                System.out.println(vetorIntercala2[contador++]);
            }
        }

        scanner.close();

    }
}
