package local.skylerwebdev.javaschooldeploy.services;

import local.skylerwebdev.javaschooldeploy.models.Course;
import local.skylerwebdev.javaschooldeploy.view.CountStudentsInCourses;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface CourseService
{
    ArrayList<Course> findAll(Pageable pageable);

    ArrayList<CountStudentsInCourses> getCountStudentsInCourse();

    void delete(long id);
}