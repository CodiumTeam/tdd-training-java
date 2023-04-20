import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineTest {

    private Maker maker;
    private CoffeeMachine coffeeMachine;

    @BeforeEach
    void setUp() {
        maker = mock(Maker.class);
        coffeeMachine = new CoffeeMachine(maker);
    }

    @Test
    public void prepare_a_coffee_without_sugar() {
        coffeeMachine.prepareCoffee();

        verify(maker).prepare(new Drink(DrinkType.Coffee, 0));
    }

    @Test
    public void prepare_a_tea_without_sugar() {
        coffeeMachine.prepareTea();

        verify(maker).prepare(new Drink(DrinkType.Tea, 0));
    }

    @Test
    public void prepare_a_chocolate_without_sugar() {
        coffeeMachine.prepareChocolate();

        verify(maker).prepare(new Drink(DrinkType.Chocolate, 0));
    }


}
