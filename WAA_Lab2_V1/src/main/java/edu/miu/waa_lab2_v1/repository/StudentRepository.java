package edu.miu.waa_lab2_v1.repository;

import edu.miu.waa_lab2_v1.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepository {
    List<Student> students = new ArrayList<>();

    public List<Student> listOfStudent() {
        return students;
    }

    public Student studentById(int id) {
        return students.get(id);
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(int id, Student student) {
//        Student studentUpdate = students.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
//        studentUpdate.setFirstName(student.getFirstName());
//        studentUpdate.setLastName(student.getLastName());
//        studentUpdate.setEmail(student.getEmail());
//        studentUpdate.setMajor(student.getMajor());
//        studentUpdate.setCoursesTaken(student.getCoursesTaken());
//        studentUpdate.setGpa(student.getGpa());
        students.set(id, student);
        return student;
    }

    public boolean deleteStudent(int id) {
        students = students.stream().filter(e -> e.getId() != id).toList();
        students.remove(id);
        return true;
    }

    public List<Student> allStudentByMajor(String major) {
        return students.stream().filter(e -> e.getMajor().equals(major)).toList();
    }

}
