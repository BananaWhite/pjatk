package pja.edu.pjatk.student;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id")
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "st")
    @NotEmpty
    private String studentNumber;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "lastname")
    @NotEmpty
    private String lastName;

    @Column(name = "email")
    @NotEmpty
    private String email;

    @Column(name = "iemail")
    @NotEmpty
    private String iemail;

    @Column(name = "password")
    @NotEmpty
    private String password;

    public Long getId() {
        return id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIemail() {
        return iemail;
    }

    public void setIemail(String iemail) {
        this.iemail = iemail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.id)
                .append("st", this.studentNumber)
                .append("name", this.name)
                .append("lastName", this.lastName)
                .append("email", this.email)
                .append("iemail", this.iemail)
                .append("password", this.password)
                .toString();
    }
}
