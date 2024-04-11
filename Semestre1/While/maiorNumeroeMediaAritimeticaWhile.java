package Semestre1.While;

import java.util.Scanner;

public class maiorNumeroeMediaAritimeticaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contSomaValores = 0;
        int contValores =  0;

        while (true) {

            System.out.print("\nEscreva um número: ");
            int valorNum = scanner.nextInt();

            contSomaValores += valorNum;

            if (valorNum != 0) {
                System.out.println("\nDigite 1 - Para adicionar mais um número");
                System.out.print("Digite 2 - Se quiser fechar o programa e saber o resultado da soma de todos os valores e sua média aritmética\nOpção: ");
                int valorOpcao = scanner.nextInt();

                contValores += 1;


                if (valorOpcao == 2) {
                    double mediaAritimetica = contSomaValores / contValores;
                    System.out.println("\nA soma de todos os valores digitados é de: " + contSomaValores);
                    System.out.println("A média aritmética de todos os valores digitados é de: " + mediaAritimetica);

                    break;
                }

            }

        }

        scanner.close();

    }
}
