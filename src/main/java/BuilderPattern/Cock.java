package BuilderPattern;

public class Cock extends ColdDrink {

    @Override
    public int price() {
        return 50;
    }

    @Override
    public String name() {
        return "Cock cola";
    }
}
