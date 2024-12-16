package factories;

import resources.Book;
import resources.LibraryResource;

public class BookFactory extends LibraryResourceFactory {
    @Override
    public LibraryResource createResource(String title) {
        return new Book(title);
    }
}
