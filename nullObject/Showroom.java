package nullObject;

public class Showroom {
    public static void main(String[] args) {
        VechileFactory factory = new VechileFactory();

        Vechile vechile = factory.getObject("bike");

        System.out.println(vechile.getSeatingCapactity());
        System.out.println(vechile.tankSize());
    }
}
