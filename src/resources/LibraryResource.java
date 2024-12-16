package resources;

public abstract class LibraryResource {
    private String title;

    public LibraryResource(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void displayInfo();
}