package BridgePattern;

public class Circle extends Shape {
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawCircle in Circle x = " + x + "y = " + y + "z = " + radius);
    }
}
