import java.util.Scanner;

public class Leitura4{
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

        /*
        Sempre que fizer a leitura de texto e numero de forma alternada a boa pratica diz para ler tudo como texto e converter o que é para ser numero para formato de numero, para isso temos as seguintes classes que fazem a conversão de texto para numero:
            integer.parseInt()
            float.parseInt()
            duble.parseInt()

        */


        String nome; //txtCodigo;
        int codigo;
        double salario;

        System.out.println("Digite o seu código :");
        
        /*  txtCodigo = teclado.nextLine();
            codigo = Integer.parseInt(txtCodigo);
        Esses dois passos podem ser feitos em uma unica linha através da reescrita: 
        codigo = Integer.parseInt(teclado.nextLine()) */

        codigo = Integer.parseInt(teclado.nextLine());

        //codigo= teclado.nextInt();


        System.out.println("Digite seu nome: ");

        nome= teclado.nextLine(); //leva em consideração tudo que digitar até o enter

        //nome= teclado.next(); //leva em consideração o que for digitado até o primeiro espaço em branco ou digitar o enter, ou seja apenas uma palavra


        System.out.println("Digite seu salario: ");

        salario= Double.parseDouble(teclado.nextLine());

        System.out.println("Seu código e seu nome: " + codigo + " - " + nome + ", seu salario é R$ " + salario);

        teclado.close();

    }
}