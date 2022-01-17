import processing.core.PApplet;

public class CirclesSketch extends PApplet {

    public static final int HEIGHT = 400;
    public static final int WIDTH = 600;
    Circle circle1;
    Circle circle2;
    Circle circle3;
    Circle circle4;


    public static void main(String[] args) {
        PApplet.main(new String[]{"--present", CirclesSketch.class.getName()});

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        int circle1VerticalPosition = HEIGHT / 5;
        int circle2VerticalPosition = HEIGHT * 2 / 5;
        int circle3VerticalPosition = HEIGHT * 3 / 5;
        int circle4VerticalPosition = HEIGHT * 4 / 5;
        circle1 = new Circle(10, 10, circle1VerticalPosition, 1, this);
        circle2 = new Circle(10, 10, circle2VerticalPosition, 2, this);
        circle3 = new Circle(10, 10, circle3VerticalPosition, 3, this);
        circle4 = new Circle(10, 10, circle4VerticalPosition, 4, this);


    }

    @Override
    public void draw() {

        circle1.display();
        circle2.display();
        circle3.display();
        circle4.display();
        circle1.moveRight();
        circle2.moveRight();
        circle3.moveRight();
        circle4.moveRight();


    }


}
