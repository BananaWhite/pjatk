package pja.edu.pjatk.course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CourseRepository extends Repository<Course, Long> {

    @Query(value = "SELECT * FROM course", nativeQuery = true)
    List<Course> getAll();
}
