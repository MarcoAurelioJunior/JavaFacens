package Semestre1.Vetor;

public class exercicio7 {
    public static void main(String[] args) {
        int[] vetorOrdenado = {8, 5, 4, 2, 7};
        boolean ordenado = true;

        for(int i = 0; i <= 3; i++){
            if(vetorOrdenado[i] < vetorOrdenado[i+1]){
                ordenado = true;
            }else{
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            System.out.println("Vetor ordenado!");
        }else{
            System.out.println("Vetor não ordenado");
        }

    }
}
