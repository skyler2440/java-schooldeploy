package local.skylerwebdev.javaschooldeploy.services;


import local.skylerwebdev.javaschooldeploy.models.User;

import java.util.List;

public interface UserService
{

    List<User> findAll();

    User findUserById(long id);

    void delete(long id);

    User save(User user);

    User update(User user, long id);
}