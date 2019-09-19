package local.skylerwebdev.javaschooldeploy.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@ApiModel(value = "Student", description = "Student Entity")
@Entity
@Table(name = "student")
public class Student
{
    @ApiModelProperty(name = "studid", value = "Primary Key for Student", required = true, example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studid;
    @ApiModelProperty(name = "studname", value = "Name of student", required = false, example = "John Smith")
    private String studname;

    @ManyToMany
    @JoinTable(name = "studcourses",
            joinColumns = {@JoinColumn(name = "studid")},
            inverseJoinColumns = {@JoinColumn(name = "courseid")})
    @JsonIgnoreProperties("students")
    private List<Course> courses = new ArrayList<>();

    public Student()
    {
    }

    public Student(String studname)
    {
        this.studname = studname;
    }

    public long getStudid()
    {
        return studid;
    }

    public void setStudid(long studid)
    {
        this.studid = studid;
    }

    public String getStudname()
    {
        return studname;
    }

    public void setStudname(String studname)
    {
        this.studname = studname;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public void setCourses(List<Course> courses)
    {
        this.courses = courses;
    }
}