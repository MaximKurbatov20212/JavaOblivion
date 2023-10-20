package nsu.ru.maxwell;

import java.util.ArrayList;
import java.util.List;

public class StudySystem {
    List<Group> groupList = new ArrayList<>();
    List<Course> courseList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();

    public boolean addCourse(Course c) {
        return courseList.add(c);
    }

    public boolean addGroup(Group c) {
        return groupList.add(c);
    }

    public boolean addStudent(Student c) {
        return studentList.add(c);
    }

    public boolean addTeacher(Teacher c) {
        return teacherList.add(c);
    }
    public boolean delTeacher(Teacher c) {
        return teacherList.remove(c);
    }

    public boolean delCourse(Course c) {
        return courseList.remove(c);
    }

    public boolean delGroup(Group c) {
        return groupList.remove(c);
    }

    public boolean delStudent(Student c) {
        return studentList.remove(c);
    }
}
