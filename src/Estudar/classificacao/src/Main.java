import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        double idade = in.nextDouble();
        if ( idade <= 13){
            System.out.println("É criança");
        }else if ( idade <= 18){
            System.out.println("É adolescente");
        } else {
            System.out.println("É adulto ");
        }
    }
}