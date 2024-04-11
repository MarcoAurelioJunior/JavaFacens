package Semestre1.For;

import java.util.Scanner;

public class mediasSalariosFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Cria um novo Scanner

        double habitantes = 15; //Variavel habitantes totais

        double contSalario = 0; //Contador que salva a soma de todos os salarios
        double calcMediaSalario = 0; //Variavel que guarda o calculo para a media do salario

        double contFilhos = 0; //Contador que salva a soma de todos os filhos 
        double calcMediaFilhos = 0;//Calcula a media dos filhos e salva na variavel

        double salarioAtualParaVerificarSeEMaior = 0; //Variavel que guarda um salario e verifica se ele é maior que o proximo

        double porcentagemSalarioPessoas = 0; //Adiciona 1 para cada pessoa com salario igual ou maior a 500

        int habitanteAtual = 0; //Pega o habitante com maior salario e coloca um número que adicionado com o i++ do loop for

        for (int i = 1; i <= habitantes; i++) {
            System.out.println("\nHabitante " + i);
            System.out.print("Informe o seu salário: ");
            double salario = scanner.nextDouble();

            System.out.print("Quantos filhos o(a) senhor(a) têm: ");
            int filhos = scanner.nextInt();

            calcMediaSalario = (contSalario += salario) / habitantes;
            calcMediaFilhos = (contFilhos += filhos) / habitantes;

            if (salario > salarioAtualParaVerificarSeEMaior) {
                salarioAtualParaVerificarSeEMaior = salario;
                habitanteAtual = i;
            }

            if (salario >= 500) {
                porcentagemSalarioPessoas += 1;
            }      

        }

        double calculoPorcentagem = (porcentagemSalarioPessoas / habitantes) * 100;
        
        System.out.println("\n - A média salárial de todos os habitantes é de: R$" + calcMediaSalario);
        System.out.println(" - A média dos filhos de todos os habitante é de: " + (int)calcMediaFilhos + " filho(s).");
        System.out.println(" - O maior salário entre os habitantes. É do habitante " + habitanteAtual + ", com um salário de: R$" + salarioAtualParaVerificarSeEMaior);
        System.out.println(" - A porcentagem de habitantes com um salário maior ou igual a R$500,00 é de: " + calculoPorcentagem + "%. Equivalente a " + (int)porcentagemSalarioPessoas + " pessoa(s) \n");

        scanner.close();

    }
}
