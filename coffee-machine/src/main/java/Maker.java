public class Maker {
    private final DrinkMaker drinkMaker;

    public Maker(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    public void prepare(Drink drink) {
        drinkMaker.execute("C::");
    }
}
