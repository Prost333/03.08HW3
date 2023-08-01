package by.pvt.hw3.service;



import by.pvt.hw3.domain.User;

import java.util.List;

public interface UserService {
 User addUser(User user);

 void deleteUser(User user);
 List<User> showAllUsers();
 User findUserforID(int id);

}

