package local.skylerwebdev.javaschooldeploy.repository;

import local.skylerwebdev.javaschooldeploy.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
