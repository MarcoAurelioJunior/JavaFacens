package Semestre1;

import java.util.Scanner;

public class mediasSalariosFor {
    public static void main(String[] args) {
        int habitantes = 5;
        Scanner scanner = new Scanner(System.in);

        int contSalario = 0;
        int calcMediaSalario = 0;

        int contFilhos = 0;
        int calcMediaFilhos = 0;

        double percentualPessoasSalario = 0;

        for (int i = 1; i <= habitantes; i++) {
            System.out.println("\nHabitante " + i);
            System.out.print("Informe o seu salário: ");
            double salario = scanner.nextDouble();

            System.out.print("Quantos filhos o(a) senhor(a) têm: ");
            double filhos = scanner.nextDouble();

            calcMediaSalario = (contSalario += salario) / habitantes;
            calcMediaFilhos = (contFilhos += filhos) / habitantes;

           
            if (salario >= 500) {
                percentualPessoasSalario = (i / 100) * habitantes;
                System.out.println(percentualPessoasSalario);
            }
            

        }
        
        System.out.println(calcMediaSalario);
        System.out.println(calcMediaFilhos);
        System.out.println(percentualPessoasSalario);


    }
}
