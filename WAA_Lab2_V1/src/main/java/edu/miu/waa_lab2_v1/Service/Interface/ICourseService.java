package edu.miu.waa_lab2_v1.Service.Interface;

import edu.miu.waa_lab2_v1.model.Course;
import java.util.List;

public interface ICourseService {
    public List<Course> getAllCourse();
    public Course getById(int id);
    public Course saveCourse(Course course);
    public Course updateCourse(int id, Course course);
    public void deleteCourse(int id);

    public List<Course> getCourseByStudentId(int sid);
}
