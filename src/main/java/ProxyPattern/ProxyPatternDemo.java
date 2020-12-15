package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("even");
        image.display();
        image.display();

        image = new ProxyImage("edna");
        image.display();
        image.display();
    }

}
