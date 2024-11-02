import java.util.Scanner;
public class BE1003{
        public static void main(String Args[]){

            int A, B, SOMA;

            Scanner teclado =  new Scanner(System.in);

            //Entrada
            //System.out.println("Digite o primeiro valor:");
            A = teclado.nextInt();

            //System.out.println("Digite o segundo valor:");
            B = teclado.nextInt();

            //PROCESSAMENTO
            SOMA = A + B;

            System.out.println("SOMA = " + SOMA);

            teclado.close();


        }
}