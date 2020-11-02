package dao;

import model.User;

import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    default int insertUser(User user){
        return insertUser(UUID.randomUUID(), user);
    }
}
