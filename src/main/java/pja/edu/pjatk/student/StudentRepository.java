package pja.edu.pjatk.student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepository extends Repository<Student, Long> {

    @Query(value = "SELECT * FROM student", nativeQuery = true)
    @Transactional(readOnly = true)
    List<Student> getAll();

    @Query(value = "SELECT * FROM student s WHERE s.st = :studentNumber", nativeQuery = true)
    @Transactional(readOnly = true)
    Student findById(@Param("studentNumber") String studentNumber);

    @Query(value = "SELECT * FROM student s WHERE s.iemail = :iemail AND s.password = :password", nativeQuery = true)
    @Transactional(readOnly = true)
    Student findByEmailAndPassword(@Param("iemail") String iemail, @Param("password") String password);
}
