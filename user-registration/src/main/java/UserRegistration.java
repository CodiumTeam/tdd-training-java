public class UserRegistration {
    private final UserRepository userRepository;
    private final IdGenerator idGenerator;

    public UserRegistration(UserRepository userRepository, IdGenerator idGenerator) {
        this.userRepository = userRepository;
        this.idGenerator = idGenerator;
    }

    public void execute(String email, String password) throws UserAlreadyExist, InvalidPasswordException {
        if (password.length() <= 9 || !password.contains("_")) {
            throw new InvalidPasswordException();
        }
        if (userRepository.findByEmail(email) != null) {
            throw new UserAlreadyExist();
        }
        String id = this.idGenerator.generate();
        this.userRepository.save(new User(id, email, password));
    }
}
