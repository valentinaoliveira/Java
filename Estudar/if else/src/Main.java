import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Crie um programa em Java que verifique se um número inserido pelo usuário é par ou ímpar.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n= in.nextInt();
        if ( n %2 == 0){
            System.out.println("Seu número é par: " +n);
        } else {
            System.out.println("Seu número é ímpar: " +n);
        }
    }
}