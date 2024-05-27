package Semestre1.Vetor;

public class exercicio6 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        
        System.out.println("Seu vetor ao contrário fica: ");
        for(int i = 4; i >= 0; i--){
            System.out.print(vetor[i] + " - ");
        }
    }
}
