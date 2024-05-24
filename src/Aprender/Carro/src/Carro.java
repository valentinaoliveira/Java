public class Carro {
    // Atributos
    private String cor;
    private int posX;
    private int posY;
    private int largura;
    private int altura;

    //Método inicializar atributo da classe
    //Construtor
    //Colocar this
    public Carro(String cor, int posX, int posY, int largura, int altura){
        this.cor = cor;
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.altura = altura;
    }


    // Métodos  para construir
    public  void andarFrente(){
        if (posY>0)
            posY--;
    }

    public void andarTras(){
        if(posY<1080-altura)
            posY++;
    }

    public void andarEsquerda(){
        if (posX>0)
            posX--;
    }

    public void andarDireita(){
        if(posX<1920-largura)
            posX++;
    }


    //Método para vizualizar
    //Mostrar os estados dos atributos
    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                ", largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}
