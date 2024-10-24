package decorator;

public class PizzaFactory {
    public static void main(String[] args) {
        BasePizza pizza = new FarmHousePizza();

        pizza = new Mushroom(new ExtraChesse(pizza));

        System.out.println(pizza.cost());
    }
}
