package data.repositories;

import data.models.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private User user;

    private int count;
    private User[] users;
    private void saveNew(User user) {
    }
    @Override
    public User save(User user) {
        boolean userHasNotBeSaved = user.getID() == 0;
        if(userHasNotBeSaved) saveNew(user);
        return user;
    }



    private int generateUserID() {
        return count+1;
    }

    @Override
    public User findByID(int ID) {
        return null;
    }

    @Override
    public int count() {
        count++;
        return count;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(int ID) {
        for(User user: user){
            if(user.getID(){
                user.remove(user);
                count--;
                break;
            }
        }
    }

    @Override
    public User deleteAll(int ID) {
        for(User user: users) if(user.getID()==ID) return user;

        return null;
    }
}
