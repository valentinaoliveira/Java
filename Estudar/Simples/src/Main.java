import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa em Java que solicite dois números ao usuário e exiba a soma deles.

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n1= in.nextDouble();
        System.out.println("Digite outro número:");
        double n2= in.nextDouble();
        double soma= n1 + n2;
        System.out.println("A soma dos dois números são: " + soma);
    }
}