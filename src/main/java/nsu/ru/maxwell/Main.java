package nsu.ru.maxwell;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Media m1 = new Book("mark", "fantasy", 100);
        Media m2 = new Book("mark1", "horror", 200);
        Media m3 = new AudioBook("mark2", "roman", 300);
        Media m4 = new AudioBook("markTwen", "horror", 400);
        Library library = new Library();

        library.addMedia(m1);
        library.addMedia(m2);
        library.addMedia(m3);
        library.addMedia(m4);

        User user = new User();

        user.getBookFromLibrary(m1, library);
        System.out.println(user.getBooks());
        System.out.println(library.getBooks());
    }
}