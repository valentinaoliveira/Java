import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = in.nextInt();
        ano = ano %4;
        if ( ano == 0){
            System.out.println("é bissexto");
        }else
            System.out.println("nao é bissexto");

        }
}