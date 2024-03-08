package casting;

public class castingNote {
    public static void main(String[] args) {

        //Casting: Operação de transformar um tipo de dado em outro

        //Widening casting (Implícito)

            byte variavelPequena = 1;
            int variavelGrande = variavelPequena;

            //Tipo pequeno (byte) consegue "entrar" no tipo maior (int)

            short variavelShort = 10;
            int variavelGrande2 = variavelShort;

            System.out.println(variavelGrande);
            System.out.println(variavelGrande2);

        //Narrowing casting (Explícito)

            long variavellong = 453543534656457L;
            byte variavelByte = (byte)variavellong;

            System.out.println(variavelByte); // CUIDADO: possivel perda de dados

            //Tipo maior (long) consegue "entrar" no tipo menor (byte)

            //para mudar o tipo é necessário colocar (tipo desejado)
        
        //Divisão com números inteiros para decimal

            int n1 = 9;
            int n2 = 2;
            float resultado = (float)n1/n2;
            //Necessário colocar variavel float e tipo float

            System.out.println(resultado);
    }
}
