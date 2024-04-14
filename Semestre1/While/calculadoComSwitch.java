package Semestre1.While;

import java.util.Scanner;

public class calculadoComSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 1; //Opção == 1
        int num1 = 0; //inicializa num1
        int num2 = 0; //inicializa num2

        while (opcao != 5 ) { //Se opção for diferente de 5
            System.out.println("\nO que deseja fazer?\n");
            System.out.print("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair \nEscolha uma dessas opções: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Escreva um número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Escreva outro número: ");
                    num2 = scanner.nextInt();

                    int soma = num1 + num2; //Calculo
                    System.out.println("\nAo somar " + num1 + " e " + num2  + " temos o resultado de: " + soma);
                    break;
                    
                case 2:
                    System.out.print("Escreva um número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Escreva outro número: ");
                    num2 = scanner.nextInt();


                    int subtrair = num1 - num2; //Calculo
                    System.out.println("\nAo subtrair " + num1 + " e " + num2 + " temos o resultado de: " + subtrair);
                    break;

                case 3:
                    System.out.print("Escreva um número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Escreva outro número: ");
                    num2 = scanner.nextInt();

                    int multiplicar = num1 * num2; //Calculo
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
                    } //Se algum número digitado for 0 então aparece essa mensagem, no caso não podemos ter divisão por 0
                    
                    int dividir = num1 / num2; //Calculo
                    System.out.println("\nAo dividir " + num1 + " e " + num2 + " temos o resultado de: " + dividir);
                    break;
                default:
                    if (opcao == 5) {
                        System.out.println("\nPrograma encerrado.");//Caso digite 5
                    }else{
                        System.out.println("\nOpção invalida, tente novamente!"); //Caso não tenha a opção digitada
                    }
                    break;
            }
    
        }
        scanner.close();
    }
}
