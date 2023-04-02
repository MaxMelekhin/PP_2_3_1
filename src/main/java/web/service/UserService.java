package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> gelAllUsers();

    public void saveUser(User user);

    User getUser(int id);

    void update(User updateUser);

    void delete(int id);
}
