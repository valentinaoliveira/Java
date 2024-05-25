import java.awt.*;
import java.util.Random;

public abstract class Shape {

    // Atributos
    private Color color;
    private int x;
    private int y;
    private int speedX;
    private int speedY;
    Random r = new Random();

    // Construtores
    public Shape(){
        this.color = this.colorGenerate();
        this.x = r.nextInt(500);
        this.y = r.nextInt(500);
        this.speedX = r.nextInt(10)+1;
        this.speedY = r.nextInt(10)+1;
    }

    public Shape(Color color, int x, int y, int speedX, int speedY){
        this.color=color;
        this.x=x;
        this.y=y;
        this.speedX=x;
        this.speedY=y;
    }

    // Métodos
    public void move(){
        this.x+=speedX;
        this.y+=speedY;
    }

    private Color colorGenerate(){
        return new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
    }

    public abstract void draw(Graphics g);
    //public abstract void  draw(Graphics g);

    // Getters & Setters

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    // toString


    @Override
    public String toString() {
        return "Shape{" +
                "speedY=" + speedY +
                ", speedX=" + speedX +
                ", y=" + y +
                ", x=" + x +
                ", color=" + color +
                '}';
    }
}
