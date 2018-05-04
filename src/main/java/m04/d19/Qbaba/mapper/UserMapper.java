package m04.d19.Qbaba.mapper;

import java.util.List;

import m04.d19.Qbaba.entity.User;

public interface UserMapper {
    List<User> selectUserAll();
    boolean getviliteUser(User user);
}