package local.skylerwebdev.javaschooldeploy.repository;


import local.skylerwebdev.javaschooldeploy.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long>
{
    User findByUsername(String username);
}
