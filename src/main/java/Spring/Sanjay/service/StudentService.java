package Spring.Sanjay.service;

import Spring.Sanjay.entity.Student;
import Spring.Sanjay.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {
        System.out.println("Inside Student Service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting Student Service");
        return studentResp;
    }

}
