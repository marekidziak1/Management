package api;
import entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public interface UserDao {
    public void saveUser(User user) throws IOException;
    public void saveUser(List<User> users) throws IOException;
    public List<User> getAllUsers() throws IOException;
    public User getUserByLogin(String login) throws IOException;
    public User getUserById(Long userId) throws IOException;
    public void removeUserByLogin(String login) throws IOException;
    public void removeUserById(Long id) throws IOException;
}
