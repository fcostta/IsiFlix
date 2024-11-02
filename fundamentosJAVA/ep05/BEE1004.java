import java.util.Scanner;

public class BEE1004{

        public static void main(String Args[]){

            int A, B, PROD;

            Scanner teclado = new Scanner(System.in);

            //ENTRADA
            A = teclado.nextInt();
            B = teclado.nextInt();

            //PROCESSAMENTO
            PROD = A * B;

            //SAIDA
            System.out.println("PROD = " + PROD);


            teclado.close();
        }
}