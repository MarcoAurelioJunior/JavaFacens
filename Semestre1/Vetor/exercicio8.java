package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        int[] vetor = {10, 15, 20, 15, 15};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja retirar: ");
        int valor = scanner.nextInt();

        int contador = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != valor){
                vetor[contador++] = vetor[i]; 
            }
        }

        System.out.println("Seu novo vetor: ");
        for(int j = 0; j < contador; j++){
            System.out.print(vetor[j] + " - ");
        }

        scanner.close();
        
    }
}
