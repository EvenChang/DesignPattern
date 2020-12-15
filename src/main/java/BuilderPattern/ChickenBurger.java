package BuilderPattern;

public class ChickenBurger extends Burger {

    @Override
    public int price() {
        return 2000;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
