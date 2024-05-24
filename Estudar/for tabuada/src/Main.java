import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crie um programa em Java que exiba a tabuada de um número fornecido pelo usuário.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        double n = in.nextDouble();
        int tabuada;
        for (int i= 1; i <=10; i++){
            System.out.println(" A tabuada do número "+ n +" escolhido é: "+ n * i);
        }
    }
}