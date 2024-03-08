package IO;

import java.util.Scanner; //Importante para o funcionamento do SCANNER

public class ioNotes {
   public static void main(String[] args) {
    
    //Input: Lê os dados digitados pelo usuário

        System.out.println("Digite um número: ");
        
        Scanner scanner = new Scanner(System.in); // Cria um novo Scanner para INPUT utilizando o sistema (teclado)
        int valorDigitado = scanner.nextInt(); // Espera o proximo número inteiro e coloca numa variável
        

        scanner.close(); //Fecha o Scanner (para não vazar informações)




    // Output: Retorna dados para o usuário

        System.out.printf("O número digitado foi: %d", valorDigitado);
   } 
}
