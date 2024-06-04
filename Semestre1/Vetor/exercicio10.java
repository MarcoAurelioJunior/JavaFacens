package Semestre1.Vetor;
public class exercicio10 {
    public static void main(String[] args) {

        int[] vetorCompressao = {0, 40, 30, 10, 30};
        int contador = 0;

       for (int i = 0; i < vetorCompressao.length; i++) {
            if (vetorCompressao[i] != 0) {
                vetorCompressao[contador++] = vetorCompressao[i];
            }
       }

       while(contador < vetorCompressao.length){
            vetorCompressao[contador++] = 0;
       }

       for (int i = 0; i < vetorCompressao.length; i++) {
            System.out.print(vetorCompressao[i] + " - ");
       }

    }
}
