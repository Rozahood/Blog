package data.repositories;

import data.models.User;

import java.util.List;

public interface UserRepository {
    User save (User user);
    User findByID (int ID);
    int count();
    List<User> findAll();
    void delete(User user);
    void delete (int ID);
    User deleteAll(int ID);
}
