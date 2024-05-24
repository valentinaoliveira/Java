import javax.swing.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Meu jeito
        //Scanner in = new Scanner(System.in);
        //System.out.println("Digite o primeiro numero: ");
        //double n1 = in.nextDouble();
        //System.out.println("Digite o segundo numero: ");
        //double n2 = in.nextDouble();
        //double média = (n1 + n2) / 2;
        //System.out.println("A média dos numeros são: " + média);



        //Jeito que o Cainã fez
        double value = 0;
        boolean erro = false;

        Scanner in = new Scanner(System.in);

        do {
            try {//Tentar executar
                value = 0;
                erro = false;
                System.out.println("Digite o primeiro numero: ");
                value += in.nextDouble();

                System.out.println("Digite o segundo numero: ");
                value += in.nextDouble();
                
                 if(value>100)
                    throw new Exception("Erro de logica");

            }catch (InputMismatchException e ) {//Ser der errado executa esse comando "catch"
                JOptionPane.showInputDialog(null,
                        "Valor invalido! Digite novamente",
                        "Mensagem do sistema",
                        2
                );

                System.out.println(e);
                erro = true;
                in.nextLine();
            }

        }while (erro);

        //Se der ou não erro, continua o programa
        System.out.println("A média das somas é:" + (value/2));

    }
}