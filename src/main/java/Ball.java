import processing.core.PApplet;

public class Ball {
    private int xCoordinate;
    private final int yCoordinate;
    private final int diameter;
    private final int speed;
    private PApplet draw;

    Ball(int x, int y, int diameter, int speed, PApplet draw) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.diameter = diameter;
        this.speed = speed;
        this.draw = draw;
    }

    public void drawBall() {
        draw.ellipse(this.xCoordinate, this.yCoordinate, this.diameter, this.diameter);
    }

    public void move() {
        this.xCoordinate += this.speed;
    }
}
