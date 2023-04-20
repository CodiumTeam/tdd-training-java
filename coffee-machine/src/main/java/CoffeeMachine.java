public class CoffeeMachine {
    private final Maker maker;

    public CoffeeMachine(Maker maker) {
        this.maker = maker;
    }

    public void prepareCoffee() {
        maker.prepare(new Drink(DrinkType.Coffee, 0));

    }
}
