import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        //Crie um programa em Java que calcule o fatorial de um número fornecido pelo usuário.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n = in.nextDouble();
        int fatorial=1;
        for (  i=1 ; i <= n; i++ ){
            fatorial *= n;
        }
        System.out.println("O fatorial do "+ n +" é: " + fatorial);

    }
}