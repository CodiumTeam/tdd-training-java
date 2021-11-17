import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class UserRegistrationTest {

    private IdGenerator idGenerator;
    private UserRepository userRepository;
    private UserRegistration userRegistration;
    private EmailSender emailSender;

    @BeforeEach
    void setUp() {
        idGenerator = mock(IdGenerator.class);
        userRepository = mock(UserRepository.class);
        emailSender = mock(EmailSender.class);
        userRegistration = new UserRegistration(userRepository, idGenerator, emailSender);
    }

    @Test
    public void persist_the_user() throws Throwable {
        when(idGenerator.generate()).thenReturn("anId");

        userRegistration.execute("an@email.com", "valid_password");

        verify(userRepository).save(new User("anId", "an@email.com", "valid_password"));
    }

    @Test
    public void sends_a_confirmation_email() throws Throwable {
        userRegistration.execute("an@email.com", "valid_password");

        verify(emailSender).send("an@email.com");
    }

    @Test
    public void do_not_allow_register_users_with_existing_email() {
        when(userRepository.findByEmail("an@email.com")).thenReturn(anyUser());

        assertThrows(UserAlreadyExist.class,
                () -> userRegistration.execute("an@email.com", "valid_password")
        );

        verify(userRepository, times(0)).save(any());
    }

    @Test
    public void do_not_allow_register_users_with_short_password() {
        assertThrows(InvalidPasswordException.class,
                () -> userRegistration.execute("an@email.com", "sort_")
        );

        verify(userRepository, times(0)).save(any());
    }

    @Test
    public void do_not_allow_register_users_with_password_without_underscore() {
        assertThrows(InvalidPasswordException.class,
                () -> userRegistration.execute("an@email.com", "nounderscorepassword")
        );

        verify(userRepository, times(0)).save(any());
    }

    private User anyUser() {
        return new User("anId", "an@email.com", "aPassword");
    }

}
