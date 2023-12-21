package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    void addUser(User user);

    void removeUser(long id);

    void updateUser(User user);

    List<User> getAllUsers();
    User getUser(long id);
}
