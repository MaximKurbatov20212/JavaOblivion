package nsu.ru.maxwell;

public class AudioBook extends Media {
    Integer duration;

    public AudioBook(String author, String genre, Integer duration) {
        super(author, genre);
        this.duration = duration;
    }
}
