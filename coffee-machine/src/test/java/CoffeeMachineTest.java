import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineTest {

    @Test
    public void prepare_a_coffee_without_sugar() {
        Maker maker = mock(Maker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(maker);

        coffeeMachine.prepareCoffee();

        verify(maker).prepare(new Drink(DrinkType.Coffee, 0));
    }

    @Test
    public void prepare_a_tea_without_sugar() {
        Maker maker = mock(Maker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(maker);

        coffeeMachine.prepareTea();

        verify(maker).prepare(new Drink(DrinkType.Tea, 0));
    }

    @Test
    public void prepare_a_chocolate_without_sugar() {
        Maker maker = mock(Maker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(maker);

        coffeeMachine.prepareChocolate();

        verify(maker).prepare(new Drink(DrinkType.Chocolate, 0));
    }


}
