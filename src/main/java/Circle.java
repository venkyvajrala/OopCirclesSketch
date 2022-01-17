public class Circle {
    int diameter;
    int horizontalPosition;
    int verticalPosition;
    int speed;
    CirclesSketch instance;

    public Circle(int diameter, int horizontalPosition, int verticalPosition, int speed, CirclesSketch instance) {
        this.diameter = diameter;
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
        this.speed = speed;
        this.instance = instance;
    }


    public void display() {

        System.out.println(horizontalPosition + "," + verticalPosition + "," + diameter);
        instance.ellipse(horizontalPosition, verticalPosition, diameter, diameter);
    }

    public void moveRight() {
        horizontalPosition += speed;
    }
}
