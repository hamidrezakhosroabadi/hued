package ir.hued.adapter.controller;


import ir.hued.adapter.controller.model.UserWeb;
import ir.hued.usecase.CreateUser;

public class UserController {

    private final CreateUser createUser;

    public UserController(final CreateUser createUser) {
        this.createUser = createUser;
    }

    public UserWeb createUser(final UserWeb userWeb) {
        var user = userWeb.toUser();
        return UserWeb.toUserWeb(createUser.create(user));
    }
}