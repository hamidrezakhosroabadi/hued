package ir.hued.applications;


import ir.hued.config.ManualConfig;
import ir.hued.entity.User;
import ir.hued.usecase.CreateUser;

public class Manual {
    public static void main(String[] args) {
        ManualConfig config = new ManualConfig();
        CreateUser createUser = config.createUser();

        User user = User.builder()
            .email("john.doe@gmail.com")
            .password("mypassword")
            .lastName("doe")
            .firstName("john")
            .build();

        User actualCreateUser = createUser.create(user);
        System.out.println("User created with id " + actualCreateUser.getId());
    }
}