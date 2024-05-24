import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double n1 = in.nextDouble();
        System.out.println("Digite a nota 2: ");
        double n2 = in.nextDouble();
        System.out.println("Digite a nota 3: ");
        double n3 = in.nextDouble();
        double media = n1 + n2 + n3 / 3;
        System.out.println("A média das notas são: " + media);
    }
}