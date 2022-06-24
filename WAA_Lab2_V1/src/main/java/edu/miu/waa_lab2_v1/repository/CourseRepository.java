package edu.miu.waa_lab2_v1.repository;

import edu.miu.waa_lab2_v1.model.Course;
import edu.miu.waa_lab2_v1.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    List<Course> courses = new ArrayList<>();

    public List<Course> listOfCourses() {
        return courses;
    }

    public Course courseById(int id) {
        return courses.get(id);
    }

    public Course saveCourse(Course c) {
        courses.add(c);
        return c;
    }

    public Course updateCourse(int id, Course c) {
        courses.set(id, c);
        return c;
    }

    public boolean deleteCourse(int id) {
        courses = courses.stream().filter(e -> e.getId() != id).toList();
        courses.remove(id);
        return true;
    }

    public List<Course> getCourseByStudentId(int sid) {
        return courses.stream().filter(e -> e.getStudent().getId() == sid).toList();
    }
}
