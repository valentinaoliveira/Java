import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;

        Scanner in = new Scanner(System.in);
        System.out.println("1 Segunda-feira \n 2 Terça-feira \n 3 Quarta-feira \n 4 Quinta-feira \n 5 Sexta-feira \n 6 Sábado \n 7 Domingo ");

       option = in.nextInt();

       switch (option) {
           case  1 :
               System.out.println("Você escolheu segunda-feira");
               break;
           case 2:
               System.out.println("Você escoleu Terça-feira");
               break;
           case 3:
               System.out.println("Você escolheu Quarta-feira");
               break;
           case 4:
               System.out.println("VocÊ escolheu Quinta-feira");
               break;
           case 5:
               System.out.println("Você escolheu Sexta-feira");
               break;
           case 6:
               System.out.println("Você escolheu Sábado");
               break;
           case 7 :
               System.out.println("Você escolheu Domingo");
               break;
           default:
               System.out.println("Inválido");
               break;
       }



    }
}