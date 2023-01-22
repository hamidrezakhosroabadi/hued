package ir.hued.config;


import ir.hued.adapter.repository.InMemoryUserRepository;
import ir.hued.usecase.CreateUser;
import ir.hued.usecase.port.UserRepository;

public class ManualConfig {
    private final UserRepository userRepository = new InMemoryUserRepository();

    public CreateUser createUser() {
        return new CreateUser(userRepository);
    }

}