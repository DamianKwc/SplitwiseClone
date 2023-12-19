package service.users;

import dto.UserDto;
import entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService{

    void saveUser(UserDto userDto);
    List<UserDto> findAllUsers();
    User findById(Integer userId);
    User findByUsername(String username);
    List<User> findAll();
    User save(User user);
    User getCurrentlyLoggedInUser();
}