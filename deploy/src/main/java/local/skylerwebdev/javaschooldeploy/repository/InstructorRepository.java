package local.skylerwebdev.javaschooldeploy.repository;

import local.skylerwebdev.javaschooldeploy.models.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface InstructorRepository extends PagingAndSortingRepository<Instructor, Long>
{
    ArrayList<Instructor> findInstructorsByInstructnameEquals (String name);
}