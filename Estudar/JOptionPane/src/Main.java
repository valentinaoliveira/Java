import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opcoes={
                "Escolha 1",
                "Escolha 2",
                "Escolha 3"

        };
        ImageIcon img = new ImageIcon("./src/img.png");

        String input = (String)  JOptionPane.showInputDialog(
                null,
                "Opções",
                "Esolha uma opção",
                3,
                img,
                opcoes,
                opcoes[2]
        );

        JOptionPane.showMessageDialog(null, input, "Titulo", 2);

    }
}