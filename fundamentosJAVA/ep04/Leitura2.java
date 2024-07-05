import java.util.Scanner;

public class Leitura2{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        //Scaner usa o idioma da maquina como padrão para realizar a leitura

        /*    int  a;
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
         */

        String nome;
        int codigo;

        System.out.println("Digite o seu código :");

        codigo= teclado.nextInt();


        System.out.println("Digite seu nome: ");

        nome= teclado.nextLine(); //leva em consideração tudo que digitar até o enter

        //nome= teclado.next(); //leva em consideração o que for digitado até o primeiro espaço em branco ou digitar o enter, ou seja apenas uma palavra



        System.out.println("Seu código e seu nome: " + codigo + " - " + nome);





        teclado.close();

    }
}