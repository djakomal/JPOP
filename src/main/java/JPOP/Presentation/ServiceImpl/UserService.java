package JPOP.Presentation.ServiceImpl;

import JPOP.Presentation.Dtos.UserDto;
import JPOP.Presentation.Models.User;
import jakarta.transaction.Transactional;

import java.util.List;

public interface UserService {
    List<User> getAll();

    @Transactional
    User add(User user);

    UserDto update(Long Id, UserDto user) throws Exception;

    void delete(Long Id);

    User getUserById(Long id);

    User login(User loginRequest);
}
