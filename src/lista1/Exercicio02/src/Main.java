import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Double number, result;
                Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        number =  (double) in.nextInt();
        result = Math.pow(number,2);
        System.out.println( " O quadrado do numero digitado é : " + result);
    }

}