package BuilderPattern;

public class Pepsi extends ColdDrink {

    @Override
    public int price() {
        return 35;
    }

    @Override
    public String name() {
        return "Pepsi cola";
    }
}
