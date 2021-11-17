public class UserRegistration {
    private final UserRepository userRepository;
    private final IdGenerator idGenerator;
    private EmailSender emailSender;

    public UserRegistration(UserRepository userRepository, IdGenerator idGenerator, EmailSender emailSender) {
        this.userRepository = userRepository;
        this.idGenerator = idGenerator;
        this.emailSender = emailSender;
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
        emailSender.send(email);
    }
}
