package Semestre1.Vetor;

public class exercicio5 {
    public static void main(String[] args) {
        int[] vetor = {10, 5, 7, 20, 21};

        System.out.println("Os elementos ímpares são: ");
        
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " - ");
            }
        }
    }
}
