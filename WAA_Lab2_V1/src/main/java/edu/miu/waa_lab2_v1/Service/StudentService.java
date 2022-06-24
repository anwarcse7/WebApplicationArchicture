package edu.miu.waa_lab2_v1.Service;

import edu.miu.waa_lab2_v1.Service.Interface.IStudentService;
import edu.miu.waa_lab2_v1.model.Student;
import edu.miu.waa_lab2_v1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.listOfStudent();
    }

    @Override
    public Student getById(int id) {
        return studentRepository.studentById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.saveStudent(student);
    }

    @Override
    public Student updateStudent(int id, Student student) {
        return studentRepository.updateStudent(id, student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }

    @Override
    public List<Student> getStudentByMajor(String major) {
        return studentRepository.allStudentByMajor(major);
    }
}
