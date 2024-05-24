import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite 10 valores:");
        int[] vector = new int [10];
        int [] bigger = new int [2];
        int [] smaller = new  int [2];
        Scanner in = new Scanner(System.in);


        for(int i=0; i<vector.length;i++){
            vector[i]=in.nextInt();
        }
        bigger[0] = vector [0];
        smaller [0]= vector [0];
        for(int i=0;i< vector.length;i++){
            if (vector[i]>bigger[0]){
                bigger [0]=vector[i];
                bigger [1] = i;
            }
            if (vector[1]<smaller[0]){
                smaller [0] = vector[i];
                smaller [1] = i;
            }
        }
        System.out.println("Maior valor = " + bigger[0] + " na posição:" +bigger[1]);
        System.out.println("Menor valor = " + smaller[0] + " na posição:" +smaller[1]);
    }
}