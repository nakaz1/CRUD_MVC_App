package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User get(long id);
    List<User> list();
    void update(User user);
    void remove(User user);

}
