package com.najimov.modules.solid.singleton;

public class UserService {
    private final UserValidation validation;
    private final UserRepository repository;
    private final EmailService emailService;
    private final AuditLogger logger;

    public UserService(UserValidation validation, UserRepository repository, EmailService emailService, AuditLogger logger) {
        this.validation = validation;
        this.repository = repository;
        this.emailService = emailService;
        this.logger = logger;
    }

    public void registerUser(String username, String email) {
        validation.validate(username, email);
        repository.save(username, email);
        emailService.sendWelcomeEmail(email);
        logger.log("User registered: " + username);
    }

    public static void main(String[] args) {
        UserService userService = new UserService(new UserValidation(), new UserRepository(), new EmailService(), new AuditLogger());
        userService.registerUser("razorbilldev", "najimovm11@gmail.com");
    }


}

