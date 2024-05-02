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

        while (contador < vetorCompressao.length) { //Ex: se tivermos 3 números diferentes de 0 então contador == 0. então ele vai fazer essa função até o número de elementos da lista (5)
            vetorCompressao[contador++] = 0; //Como são 3 elementos diferentes de 0. então o indice em que ele vai colocar os ZEROS é no 3, e no 4, pois ele vai somar mais um ao contador, assim finalizando em 4, que é menor que 5, então saindo do while
        }
        for (int k = 0; k < 5; k++) {
            System.out.println(vetorCompressao[k]);
        }
    }
}
