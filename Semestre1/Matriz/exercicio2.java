package Semestre1.Matriz;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int menorNumero = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Escreva o elemento da linha " + (i + 1) + ", da coluna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
                menorNumero = matriz[0][0];
                
                if (matriz[i][j] < menorNumero) {
                    menorNumero = matriz[i][j];
                }
            }
        }


        System.out.println(menorNumero);

        scanner.close();
    }
}
