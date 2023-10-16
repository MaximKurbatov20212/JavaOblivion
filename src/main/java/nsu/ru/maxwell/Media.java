package nsu.ru.maxwell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Media {
    String author;
    String genre;

    public Media(String author, String genre) {
        this.author = author;
        this.genre = genre;
    }
}
