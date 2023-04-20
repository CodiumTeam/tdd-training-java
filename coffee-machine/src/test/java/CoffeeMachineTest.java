import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineTest {

    @Test
    public void prepare_a_coffee_without_sugar() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMaker);

        coffeeMachine.prepareCoffee();

        verify(drinkMaker).execute("C::");
    }


}
