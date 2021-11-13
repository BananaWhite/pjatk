package pja.edu.pjatk.dashboard;

import org.springframework.stereotype.Controller;
import pja.edu.pjatk.student.StudentRepository;

@Controller
public class DashboardController {
    private StudentRepository studentRepository;

    public DashboardController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
