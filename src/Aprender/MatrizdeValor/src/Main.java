public class Main {
    public static void main(String[] args) {

        int [] [] matriz = {{1,2,3,4},
                            {5,6,7,8},
                            {5,6,7,8}};
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[0].length; j++){
                System.out.println(matriz[i][j]+", ");
            }
            System.out.println(" ");
        }



        // matriz.length quantidade de linhas
        // matriz[0].length quantidade de colunas
    }
}