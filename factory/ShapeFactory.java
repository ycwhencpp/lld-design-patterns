package factory;

public class ShapeFactory {
    public Shape getShape(String shape_str) {
        if (shape_str == "circle")
            return new Circle();
        else if (shape_str == "square")
            return new Square();
        else
            return null;
    }
}
