package decorator;

public class ExtraChesse extends ToppingDecorator {
    BasePizza pizza;

    public ExtraChesse(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
