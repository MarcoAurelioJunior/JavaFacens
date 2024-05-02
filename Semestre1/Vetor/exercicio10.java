package Semestre1.Vetor;

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorCompressao = new int[5];
        int contador = 0;
        int contadorDeZeros = 0;

        for(int i = 0; i < vetorCompressao.length; i++){
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorCompressao[i] = scanner.nextInt();
        }

        
        for(int j = 0; j < vetorCompressao.length; j++){
            if(vetorCompressao[j] != 0){
               vetorCompressao[contador++] = vetorCompressao[j];
            }else{
                contadorDeZeros++;
            }
        }

        for (int r = 4; r > contadorDeZeros; r--) {
            vetorCompressao[r] = 0;
        }

        for (int k = 0; k < 5; k++) {
            System.out.println(vetorCompressao[k]);
        }
    }
}
