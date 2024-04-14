package Semestre1.While;

import java.util.Scanner;

public class calculadoComSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 1;
        int num1 = 0;
        int num2 = 0;

        while (opcao != 5 ) {
            System.out.println("\nO que deseja fazer?\n");
            System.out.print("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair \nEscolha uma dessas opções: ");
            opcao = scanner.nextInt();

            
            switch (opcao) {
                case 1:
                    System.out.print("Escreva um número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Escreva outro número: ");
                    num2 = scanner.nextInt();

                    int soma = num1 + num2;
                    System.out.println("\nAo somar " + num1 + " e " + num2  + " temos o resultado de: " + soma);
                    break;
                    
                case 2:
                    System.out.print("Escreva um número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Escreva outro número: ");
                    num2 = scanner.nextInt();


                    int subtrair = num1 - num2;
                    System.out.println("\nAo subtrair " + num1 + " e " + num2 + " temos o resultado de: " + subtrair);
                    break;

                case 3:
                    System.out.print("Escreva um número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Escreva outro número: ");
                    num2 = scanner.nextInt();

                    int multiplicar = num1 * num2;
                    System.out.println("\nMultiplicando " + num1 + " e " + num2 + " temos o resultado de: " + multiplicar);
                    break;

                case 4:
                    System.out.print("Escreva um número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Escreva outro número: ");
                    num2 = scanner.nextInt();

                    if (num1 == 0 || num2 == 0) {
                        System.out.println("\nNão é possivel dividir por ZERO, tente novamente!");
                        break;
                    }
                    
                    int dividir = num1 / num2;
                    System.out.println("\nAo dividir " + num1 + " e " + num2 + " temos o resultado de: " + dividir);
                    break;
                default:
                    if (opcao == 5) {
                        System.out.println("Programa encerrado.");
                    }else{
                        System.out.println("Opção invalida, tente novamente!");
                    }
                    break;
            }
    

        }
    }
}
