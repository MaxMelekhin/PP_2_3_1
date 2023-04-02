package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> gelAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void update(User updateUser);

    public void delete(int id);
}
