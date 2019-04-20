package ua.net.azhytnytskyi.articlesserver.service;

import ua.net.azhytnytskyi.articlesserver.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
    List<User> getUsers();

}
