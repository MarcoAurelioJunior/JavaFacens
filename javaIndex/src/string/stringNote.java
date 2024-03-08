package string;

import java.util.Scanner;

public class stringNote {
    public static void main(String[] args) {
        //String texto = "Um texto";
        //System.out.print(texto);

        System.out.print("Escreva o seu Nome: ");

        Scanner scanner = new Scanner(System.in);
        String textoDigitado = scanner.nextLine();
        scanner.close();

        System.out.printf("Ok, que belo nome: " + textoDigitado +". Irei fazer o seu cadastro!'");
    }
}
