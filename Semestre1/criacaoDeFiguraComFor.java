package Semestre1;

public class criacaoDeFiguraComFor {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { //i vai ser igual a 5, se i for maior ou igual a 1 então tire 1 de i
            for (int j = i; j <= 5; j++) { //j recebe i, onde inicialmente i = 5, então se j for menor ou igual a 5 adicione 1 a j
                System.out.print("*");
                
            }//for de j pausa por causa que j agora é maior que 5, no caso 6 ja que foi adicionado 1...
            System.out.println("");
        }//for de i continua já que 5 ainda é maior ou igual a 1, porém foi retirado 1 de i, nesse caso i = 4...

    }
}
