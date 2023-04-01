package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> gelAllUsers();
    public void saveUser(User user);
}
