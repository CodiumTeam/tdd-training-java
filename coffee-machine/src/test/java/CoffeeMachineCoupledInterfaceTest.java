import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineCoupledInterfaceTest {

    @Test
    public void prepare_a_coffee_without_sugar() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        Maker maker = new Maker(drinkMaker);
        CoffeeMachine coffeeMachine = new CoffeeMachine(maker);

        coffeeMachine.prepareCoffee();

        verify(drinkMaker).execute("C::");
    }
}
