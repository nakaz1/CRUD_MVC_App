package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{
    private static int count;
    private List<User> users;
    {
        users = new ArrayList<User>();
        users.add(new User(++count, "John"));
        users.add(new User(++count, "John2"));
        users.add(new User(++count, "John3"));
        users.add(new User(++count, "John4"));
        users.add(new User(++count, "John5"));

    }

    @Override
    public List<User> index(){
        return users;
    }

    @Override
    public User getUserById(int id){
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

}
