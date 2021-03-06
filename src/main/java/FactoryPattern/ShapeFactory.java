package FactoryPattern;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){

        switch (shapeType.toLowerCase()) {

            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            case "square":
                return new Square();

            default:
                return null;
        }
    }
}
