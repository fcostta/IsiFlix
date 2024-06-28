import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        //Scaner usa o idioma da maquina como padrão para realizar a leitura

            int  a;
            float  b;
            double  c;

            System.out.println("Por favor, digite um numero inteiro:");

            a = teclado.nextInt();

            System.out.println("Você digitou o valor " + a);

            System.out.println("Por favor, digite um número float:");

            b = teclado.nextFloat();

            System.out.println("Você digitou o valor " + b);

            System.out.println("Porfavor, digite um valor Double: ");

            c = teclado.nextDouble();

            System.out.println("Voce digitou o valor " + c);
            //ou podemos fazer assim:
            System.out.printf("Você digitou o valor %.3f\n", c);


        teclado.close();

    }
}