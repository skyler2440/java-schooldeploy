package local.skylerwebdev.javaschooldeploy.services;

import local.skylerwebdev.javaschooldeploy.models.Role;

import java.util.List;

public interface RoleService
{
    List<Role> findAll();

    Role findRoleById(long id);

    void delete(long id);

    Role save(Role role);

    Role findByName(String name);
}