package Semestre1.Matriz;

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int soma = 0;
        int media = 1;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Escreva o elemento da linha " + (i + 1) + ", da coluna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
                
                soma += matriz[i][j];
            }
        }

        media = soma / (matriz.length*matriz.length);

        System.out.println("A média é: " + media);

        scanner.close();
    }
}
