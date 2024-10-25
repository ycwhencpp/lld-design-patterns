package nullObject;

public class VechileFactory {
    public Vechile getObject(String typeOfObject) {
        if (typeOfObject.equals("CAR")) {
            return new Car();
        }
        return new NullVechileObject();
    }
}
