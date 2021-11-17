import org.junit.jupiter.api.Assertions;
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
    public void persist_the_user() throws UserAlreadyExist {
        when(idGenerator.generate()).thenReturn("anId");

        userRegistration.execute("an@email.com", "valid_password");

        verify(userRepository).save(new User("anId", "an@email.com", "valid_password"));
    }

    @Test
    public void do_not_allow_register_users_with_existing_email() {
        when(userRepository.findByEmail("an@email.com")).thenReturn(anyUser());

        Assertions.assertThrows(UserAlreadyExist.class,
                () -> userRegistration.execute("an@email.com", "valid_password")
        );

        verify(userRepository, times(0)).save(any());
    }

    private User anyUser() {
        return new User("anId", "an@email.com", "aPassword");
    }

}
