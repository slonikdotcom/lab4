package resources;

public class Book extends LibraryResource {
    public Book(String title) {
        super(title);
    }

    @Override
    public void displayInfo() {
        System.out.println("Книга: " + getTitle());
    }
}
