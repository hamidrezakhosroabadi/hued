package ir.hued.usecase;


import ir.hued.entity.User;
import ir.hued.usecase.port.UserRepository;

import java.util.UUID;

public final class CreateUser {

    private final UserRepository repository;

    public CreateUser(final UserRepository repository) {
        this.repository = repository;
    }

    public User create(final User user) {

        User userToSave = User.builder()
            .id(UUID.randomUUID().toString())
            .email(user.getEmail())
            .password(UUID.randomUUID().toString())
            .lastName(user.getLastName())
            .firstName(user.getFirstName())
            .build();
        return repository.create(userToSave);
    }
}