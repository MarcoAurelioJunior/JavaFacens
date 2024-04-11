package Semestre1.While;

import java.util.Scanner;

public class calculadoComSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            
            System.out.println("\nO que deseja fazer?\n");
            System.out.print("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair \nEscolha uma dessas opções: ");
            int opcao = scanner.nextInt();

            System.out.print("Escreva um número: ");
            int num1 = scanner.nextInt();

            System.out.print("Escreva outro número: ");
            int num2 = scanner.nextInt();
        
            switch (opcao) {
                case 1:
                int soma = num1 + num2;
                    System.out.println("\nAo somar " + num1 + " e " + num2  + " temos o resultado de: " + soma);
                    break;
                    
                case 2:
                    int subtrair = num1 - num2;
                    System.out.println("\nAo subtrair " + num1 + " e " + num2 + " temos o resultado de: " + subtrair);
                    break;

                case 3:
                    int multiplicar = num1 * num2;
                    System.out.println("\nMultiplicando " + num1 + " e " + num2 + " temos o resultado de: " + multiplicar);
                    break;

                case 4:
                    int dividir = num1 / num2;
                    System.out.println("\nAo dividir " + num1 + " e " + num2 + " temos o resultado de: " + dividir);
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opa, não temos essa opção, tente novamente!");
                    break;
            }
        } while (true);
    }
}
