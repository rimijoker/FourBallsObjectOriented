import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    ArrayList<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        balls = new ArrayList<>();
        initBalls();
    }

    private void initBalls() {
        for (int i = 1; i < 5; i++) {
            Ball newBall = new Ball(0, i * HEIGHT / 5, 16, i, this);
            balls.add(newBall);
        }
    }

    @Override
    public void draw() {
        balls.forEach(Ball::drawBall);
        balls.forEach(Ball::move);
    }
}
