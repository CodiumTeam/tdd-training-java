public class UserRegistration {
    private final UserRepository userRepository;
    private final IdGenerator idGenerator;

    public UserRegistration(UserRepository userRepository, IdGenerator idGenerator) {
        this.userRepository = userRepository;
        this.idGenerator = idGenerator;
    }

    public void execute(String email, String password) {
        String id = this.idGenerator.generate();
        this.userRepository.save(new User(id, email, password));
    }
}
