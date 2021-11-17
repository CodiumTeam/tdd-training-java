import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserRegistrationTest {
    @Test
    public void persist_the_user(){
        IdGenerator idGenerator = mock(IdGenerator.class);
        when(idGenerator.generate()).thenReturn("anId");
        UserRepository userRepository = mock(UserRepository.class);
        UserRegistration userRegistration = new UserRegistration(userRepository, idGenerator);

        userRegistration.execute("an@email.com", "valid_password");

        verify(userRepository).save(new User("anId", "an@email.com", "valid_password"));
    }

}
