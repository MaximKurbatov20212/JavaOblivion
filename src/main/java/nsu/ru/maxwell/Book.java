package nsu.ru.maxwell;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Book extends Media implements Comparable<Book> {
    Integer pageCount;

    public Book(String author, String genre, Integer pageCount) {
        super(author, genre);
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book o) {
        if (!Objects.equals(this.author, o.author)) return 0;
        if (!Objects.equals(this.genre, o.genre)) return 0;
        return Integer.compare(o.pageCount, this.pageCount);
    }
}
