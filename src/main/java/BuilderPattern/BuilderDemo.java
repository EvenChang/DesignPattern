package BuilderPattern;


public class BuilderDemo {


    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();
        Meal meal = builder.prepareNonVegMeal();
        meal.showItems();

        System.out.println(meal.getCost());

        MealBuilder builder1 = new MealBuilder();
        Meal meal1 = builder1.prepareVegMeal();
        meal1.showItems();
        System.out.println(meal1.getCost());

    }


}
