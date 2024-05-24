import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        double n1= in.nextDouble();
        System.out.println("Digite outro número inteiro:");
        double n2= in.nextDouble();

        if (n1>n2) {
            System.out.println("O primeiro número é maior que o segundo número  ");
        } else if (n2>n1) {
            System.out.println(" O segundo número é maior que o primeiro número ");
        }
        else {
            System.out.println("Os números são iguais");
        }

    }
}
