package Semestre1.While;

import java.util.Scanner;

public class maiorNumeroeMediaAritimeticaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contSomaValores = 0;//Soma todos os números digitados
        int contValores =  0; //Conta quantos números foram colocados

        int numeroAtualMaior = 0;//Verifica entre essa variavel e o valorNum qual o maior número

        while (true) {

            System.out.print("\nEscreva um número: ");
            int valorNum = scanner.nextInt();

            contSomaValores += valorNum;

            if (valorNum != 0) {//Se diferente de 0 então inicia o programa
                System.out.println("\nDigite 1 - Para adicionar mais um número");
                System.out.print("Digite 2 - Se quiser fechar o programa e saber o resultado da soma de todos os valores e sua média aritmética\nOpção: ");
                int valorOpcao = scanner.nextInt();

                contValores += 1;//Conta cada valor

                if (valorNum > numeroAtualMaior) { //Verifica quais das duas variaveis é maior
                    numeroAtualMaior = valorNum; //Se valorNum for maior então adicione esse valor a variavel numeroAtualMaior
                }

                if (valorOpcao == 2 && contValores != 1) { //Coloquei essa outra condição, caso o usuario coloque apenas 1 número e tente fechar o programa 
                    System.out.println("\nO maior número da sua lista é o: " + numeroAtualMaior);

                    double mediaAritimetica = contSomaValores / contValores;//Calculo média
                    System.out.println("A média aritmética de todos os valores digitados é de: " + mediaAritimetica);

                    break;
                }else if (valorOpcao == 2 && contValores == 1) {//Se o usuario tentar fechar o programa com apenas um número, faz com que ele tente novamente!
                    System.out.println("\nPara ter o seu resultado digite pelo menos mais UM número!");
                }
                
            }else{ //Coloquei esse else, caso o usuario tente iniciar o programa com 0
                System.out.println("\nEscreva um número DIFERENTE de 0 (zero)");
            }

        }

        scanner.close();

    }
}
