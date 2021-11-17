import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserRegistrationTest {

    private IdGenerator idGenerator;
    private UserRepository userRepository;
    private UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        idGenerator = mock(IdGenerator.class);
        userRepository = mock(UserRepository.class);
        userRegistration = new UserRegistration(userRepository, idGenerator);
    }

    @Test
    public void persist_the_user(){
        when(idGenerator.generate()).thenReturn("anId");

        userRegistration.execute("an@email.com", "valid_password");

        verify(userRepository).save(new User("anId", "an@email.com", "valid_password"));
    }

}
