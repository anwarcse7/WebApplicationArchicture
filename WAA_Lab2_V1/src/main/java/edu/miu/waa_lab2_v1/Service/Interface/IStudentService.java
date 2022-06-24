package edu.miu.waa_lab2_v1.Service.Interface;

import edu.miu.waa_lab2_v1.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> getAllStudent();
    public Student getById(int id);
    public Student saveStudent(Student student);
    public Student updateStudent(int id, Student student);
    public void deleteStudent(int id);
    public List<Student> getStudentByMajor(String major);
}
