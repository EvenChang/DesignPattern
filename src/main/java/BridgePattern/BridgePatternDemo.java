package BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 200, 300, new RedCircle());
        Shape greenCircle = new Circle(200, 300, 400, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        Shape testCircle = new Circle(300, 400, 500, new RedCircle());
        testCircle.drawCircle(400, 500, 600);

    }
}
