package nsu.ru.maxwell;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Library {
    private List<Media> books = new ArrayList<>();

    public boolean addMedia(Media media) {
        return books.add(media);
    }

    public boolean deleteMedia(Media media) {
        return books.removeIf(m -> Objects.equals(m, media));
    }

    public Media getMedia(Media media) {
        Media desireMedia = books.stream().filter(media1 -> media1.comp)


        if (desireMedia == null) return null;
        books.remove(desireMedia);

        return desireMedia;
    }
}
