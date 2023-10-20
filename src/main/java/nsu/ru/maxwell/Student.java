package nsu.ru.maxwell;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student {
    String name;
    String age;
    String lastName;
    Integer studNum;
    List<Homework> homeworkList = new ArrayList<>();

    public boolean addHomework(Homework homework) {
        return homeworkList.add(homework);
    }

    public void postHomework(Teacher t, Homework h) {
        t.getHomework(h);
    }
}
