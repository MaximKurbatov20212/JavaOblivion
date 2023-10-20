package nsu.ru.maxwell;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class User {
    private final Set<Media> books = new HashSet<>();

    public boolean getBookFromLibrary(Media media, Library library) {
        Media desireMedia = library.getMedia(media);

        if (desireMedia == null) return false;
        return books.add(desireMedia);
    }
}
