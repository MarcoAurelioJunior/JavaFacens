package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorCompressao = new int[5];
        int contador = 0;

        for(int i = 0; i < vetorCompressao.length; i++){
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorCompressao[i] = scanner.nextInt();
        }

        
        for(int j = 0; j < vetorCompressao.length; j++){
            if(vetorCompressao[j] != 0){
               vetorCompressao[contador++] = vetorCompressao[j]; //Contador adiciona +1 aos elementos diferente de 0 
            }
        }

        while (contador < vetorCompressao.length) {
            vetorCompressao[contador++] = 0; //Ele pega a quantidade de números diferentes de 0, ex: 3, e soma mais 1 até o tamanho final da Lista(5)
        } //No caso ele vai pegando a posição do elemento, Ex: vetorCompressao[3 + 1] = 0, ou seja a posição 3 + 1 coloca 0 a essa posição
        for (int k = 0; k < 5; k++) {
            System.out.println(vetorCompressao[k]);
        }

        scanner.close();
    }
}
