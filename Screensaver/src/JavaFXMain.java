
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;
import java.awt.*;


public class JavaFXMain extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        Group root = new Group();

        Scene scene = new Scene(root,  500, 500);
        scene.setFill(Color.AQUA);

        primaryStage.setScene(scene);

        Rectangle r1 = new Rectangle();

        r1.setX(10);
        r1.setY(10);
        r1.setHeight(80);
        r1.setWidth(80);
        r1.setFill(Color.MAGENTA);
        root.getChildren().add(r1);

        double speed = 1;

        final long startNanoTime = System.nanoTime();

        new AnimationTimer(){
            @Override
            public void handle(long currentNanoTime){
                double timer  = ( currentNanoTime - startNanoTime ) /  10000000000.0;
                //Animação fica aqui
                r1.setX(r1.getX()+speed);

                primaryStage.getWidth();


            }

        }.start();

        primaryStage.show();


    }
}

