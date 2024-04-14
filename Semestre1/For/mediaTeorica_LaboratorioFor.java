package Semestre1.For;

import java.util.Scanner;

public class mediaTeorica_LaboratorioFor {
    public static void main(String[] args) {
        int alunos = 30; //Quantidade de alunos
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= alunos; i++) {
            System.out.println("\nAluno " + i);
            System.out.print("Coloque sua média de teoria: ");
            float mediaTeoria = scanner.nextFloat();

            System.out.print("Coloque sua média de laboratório: ");
            float mediaLaboratorio = scanner.nextFloat();

            float calcMediaFinal = (mediaTeoria * 0.6f) + (mediaLaboratorio * 0.4f); //Calcula a media final
        

            if(calcMediaFinal >= 7){ //Se maior ou igual a 7
                System.out.printf("\nVocê foi BEM. Com uma média final de: %.1f \n",calcMediaFinal);
            }else if(calcMediaFinal >= 5 && calcMediaFinal < 7){//Se maior ou igual a 5 e menor que 7
                System.out.printf("\nVocê foi RAZOáVEL. Com uma média final de: %.1f \n",calcMediaFinal);
            }else if(calcMediaFinal < 5){ //Se menor que 5
                System.out.printf("\nVocê foi MAL. Com uma média final de: %.1f \n",calcMediaFinal);
            }else{
                System.out.println("\nOcorreu algum erro!\n");
            }
        }

        scanner.close();
    }
}