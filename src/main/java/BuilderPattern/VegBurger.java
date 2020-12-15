package BuilderPattern;

public class VegBurger extends Burger {

    @Override
    public int price() {
        return 1000;
    }

    @Override
    public String name() {
        return "Vegetable Burger";
    }
}
