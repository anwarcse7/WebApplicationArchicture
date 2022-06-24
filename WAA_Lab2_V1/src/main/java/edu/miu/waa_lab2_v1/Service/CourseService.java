package edu.miu.waa_lab2_v1.Service;

import edu.miu.waa_lab2_v1.Service.Interface.ICourseService;
import edu.miu.waa_lab2_v1.model.Course;
import edu.miu.waa_lab2_v1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.listOfCourses();
    }

    @Override
    public Course getById(int id) {
        return courseRepository.courseById(id);
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.saveCourse(course);
    }

    @Override
    public Course updateCourse(int id, Course course) {
        return courseRepository.updateCourse(id, course);
    }

    @Override
    public void deleteCourse(int id) {

    }

    public List<Course> getCourseByStudentId(int sid) {
        return courseRepository.getCourseByStudentId(sid);
    }

}
