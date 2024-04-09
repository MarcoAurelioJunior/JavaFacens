package Semestre1;

import java.util.Scanner;

public class mediaTeorica_Laboratorio {
    public static void main(String[] args) {
        int alunos = 30;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= alunos; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Coloque sua média de teoria: ");
            double mediaTeoria = scanner.nextFloat();

            System.out.print("Coloque sua média de laboratório: ");
            double mediaLaboratorio = scanner.nextFloat();

            double calcMediaFinal = (mediaTeoria * 0.6) + (mediaLaboratorio * 0.4);

            if(calcMediaFinal >= 7){
                System.out.println("\nVocê foi BEM.\n");
            }else if(calcMediaFinal >= 5 && calcMediaFinal < 7){
                System.out.println("\nVocê foi RAZOáVEL.\n" );
            }else if(calcMediaFinal < 5){
                System.out.println("\nVocê foi MAL.\n");
            }else{
                System.out.println("\nOcorreu algum erro!\n");
            }
        }

        scanner.close();
    }
}