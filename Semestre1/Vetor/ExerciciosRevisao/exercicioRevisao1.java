package Semestre1.Vetor.ExerciciosRevisao;

import java.util.Scanner;
public class exercicioRevisao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o elemento " + (i + 1) + ": "); 
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Qual valor você deseja retirar: (1 - par. 2 - impar)"); 
        int retirar = scanner.nextInt();

        int contador = 0;

        for(int j = 0; j < vetor.length; j++){
            if (retirar == 1) {
                if (vetor[j] % 2 != 0) { 
                    vetor[contador++] = vetor[j];
                }    
            }else if(retirar == 2){
                if (vetor[j] % 2 == 0) {
                    vetor[contador++] = vetor[j];
                }
            }
        }

        for(int k = 0; k < contador; k++){
            System.out.print(vetor[k] + " ");
        }

        scanner.close();
    }
}
