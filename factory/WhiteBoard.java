package factory;

public class WhiteBoard {
    public static void main(String[] args) {
        String shapee_to_be_drawn = "circle";
        ShapeFactory shapefactory = new ShapeFactory();
        Shape shape = shapefactory.getShape(shapee_to_be_drawn);
        shape.draw();

    }
}
