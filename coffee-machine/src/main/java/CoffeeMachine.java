public class CoffeeMachine {
    private final Maker maker;

    public CoffeeMachine(Maker maker) {
        this.maker = maker;
    }

    public void prepareCoffee() {
        maker.prepare(new Drink(DrinkType.Coffee, 0));
    }

    public void prepareTea() {
        maker.prepare(new Drink(DrinkType.Tea, 0));
    }

    public void prepareChocolate() {
        maker.prepare(new Drink(DrinkType.Chocolate, 0));
    }
}
