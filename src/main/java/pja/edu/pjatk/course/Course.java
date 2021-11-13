package pja.edu.pjatk.course;

import pja.edu.pjatk.dept.Dept;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "id")
    private Long id;

    @JoinColumn(foreignKey = @ForeignKey(name = "course_ibfk_1"))
    private Long deptId;

    @Column(name = "courseName")
    private String courseName;
}
