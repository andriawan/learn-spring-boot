package repository;

import dao.UserDao;
import model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository implements UserDao {
    private static List<User> userList = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        user.setId(id);
        userList.add(user);
        return 1;
    }
}
