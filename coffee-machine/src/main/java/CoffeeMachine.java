public class CoffeeMachine {
    private final Maker maker;
    private int sugar;

    public CoffeeMachine(Maker maker) {
        this.maker = maker;
        this.sugar = 0;
    }

    public void prepareCoffee() {
        maker.prepare(new Drink(DrinkType.Coffee, sugar));
    }

    public void prepareTea() {
        maker.prepare(new Drink(DrinkType.Tea, sugar));
    }

    public void prepareChocolate() {
        maker.prepare(new Drink(DrinkType.Chocolate, sugar));
    }

    public void addSugar() {
        sugar = 1;
    }
}
