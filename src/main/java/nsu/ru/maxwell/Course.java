package nsu.ru.maxwell;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    String description;
    Long duration;
    Teacher teacher;

    public String analyzeMarks() {
        return "";
    }
}
