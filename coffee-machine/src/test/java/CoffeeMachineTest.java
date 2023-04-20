import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineTest {

    @Test
    public void prepare_a_coffee_without_sugar() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        Maker maker = new Maker(drinkMaker);
        CoffeeMachine coffeeMachine = new CoffeeMachine(maker);

        coffeeMachine.prepareCoffee();

        verify(drinkMaker).execute("C::");
    }

    @Test
    public void prepare_a_coffee_without_sugar_with_good_interface() {
        Maker maker = mock(Maker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(maker);

        coffeeMachine.prepareCoffee();

        verify(maker).prepare(new Drink(DrinkType.Coffee, 0));
    }


}
