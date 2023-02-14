package data.repositories;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    private UserRepository userRepository;
    private User user;

    @BeforeEach
    public void setUp(){
        userRepository = new UserRepositoryImpl();
        user.setFirstName("Royal");
        user.setLastName("Chidera");
        user.setUserName("Login");
        user.setPassword("SAAS");

    }
    @Test public void saveOneUser_countIsOneTest(){
        User user = new User();
        userRepository.save(user);
        assertEquals(1, UserRepository.);
    }
    @Test public  void saveOneUser_IDOfUserIsOneTest(){

    }
    @DisplayName("Update User test")
    @Test public void saveTwoUsersWithSameName(){
        user savedUser = userRepository.save(user);
        assertEquals(1, userRepository.count());
        savedUser.setLastName("Chidera");
        userRepository.save(savedUser);
        assertEquals(1, userRepository.count());
    }
    @Test public  void saveOneUser_findUserByIDTest(){
        user savedUser = userRepository.save(user);
        assertEquals(1, userRepository.count());
    }
    @Test public void saveOneUser_deleteOneUser_countIsZeroTest(){

    }
}