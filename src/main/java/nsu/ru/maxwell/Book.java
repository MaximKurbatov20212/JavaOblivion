package nsu.ru.maxwell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Media {
    Integer pageCount;

    public Book(String author, String genre, Integer pageCount) {
        super(author, genre);
        this.pageCount = pageCount;
    }
}
