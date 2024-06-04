package Semestre1.Matriz;

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int[] somas = new int[4];
        int[] medias = new int[3]; 
        int[][] diagonal = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Digite um elemento para a matriz: ");
                matriz[i][j] = scanner.nextInt();

                somas[0] = somas[0] + matriz[i][j];

                if (i == 0) {
                    somas[1] = somas[1] + matriz[i][j];
                }else{
                    somas[2] = somas[2] + matriz[i][j];
                }

                if (i != j) {
                    somas[3] += matriz[i][j];
                }

            }

        }

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
        medias[0] = somas[0] / (matriz.length * matriz.length); //Média total
        medias[1] = somas[1] / matriz.length; //Media da linha 1
        medias[2] = somas[2] / matriz.length; //Media da linha 2

        System.out.println("A média de todos os elementos da matriz é: " + medias[0]);
        System.out.println("A média da linha 1 é: " + medias[1]); //Média da linha 1
        System.out.println("A média da linha 2 é: " + medias[2]); //Média da linha 2
        System.out.println(somas[3]); //Soma todos os números que estão fora da diagonal
        scanner.close();
    }
}
