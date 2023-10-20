package nsu.ru.maxwell;

import java.util.Objects;

public class AudioBook extends Media implements Comparable<AudioBook> {
    Integer duration;

    public AudioBook(String author, String genre, Integer duration) {
        super(author, genre);
        this.duration = duration;
    }

    @Override
    public int compareTo(AudioBook o) {
        if (!Objects.equals(this.author, o.author)) return 0;
        if (!Objects.equals(this.genre, o.genre)) return 0;
        return Integer.compare(o.duration, this.duration);
    }
}
