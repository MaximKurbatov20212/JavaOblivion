package nsu.ru.maxwell;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    String name;
    String age;
    String lastName;
    List<Subject> subjects = new ArrayList<>();
    List<Group> groupList = new ArrayList<>();
    List<Integer> marks = new ArrayList<>();

    public void getHomework(Homework h) {
        // pass
    }

    public boolean addGroup(Group g) {
        return groupList.add(g);
    }

    public boolean removeGroup(Group g) {
        return groupList.remove(g);
    }

    public void postHomework(List<Homework> h) {
        for (var homework : h) {
            groupList.stream()
                    .flatMap(g -> g.getStudentList().stream())
                    .map(student -> student.addHomework(homework));
        }
    }

    public void postMarks(List<Integer> marks) {
        // pass
    }
}
