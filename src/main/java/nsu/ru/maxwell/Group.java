package nsu.ru.maxwell;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    String name;
    List<Student> studentList = new ArrayList<>();

    public boolean addStudent(Student student) {
        return studentList.add(student);
    }

    public boolean delStudent(Student student) {
        return studentList.remove(student);
    }
}
